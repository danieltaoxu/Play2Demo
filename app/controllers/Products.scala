package controllers

import javax.inject.Inject
import models.Product
import play.api.data._
import play.api.data.Forms._
import play.api.i18n.{Lang, Langs, Messages, MessagesImpl}
import play.api.mvc.{AbstractController, Action, AnyContent, ControllerComponents, Flash}

class Products @Inject()(cc: ControllerComponents, langs: Langs) extends AbstractController(cc) with play.api.i18n.I18nSupport {
  val lang: Lang = langs.availables.head
  implicit val messages: Messages = MessagesImpl(lang, messagesApi)

  def list: Action[AnyContent] = Action { implicit request =>
    val messages: Messages = messagesApi.preferred(request)
    val products = Product.findAll
    Ok(views.html.products.list(products)(messages, request.flash))
  }

  def show(esn: Long): Action[AnyContent] = Action { implicit request =>
    val messages: Messages = messagesApi.preferred(request)
    Product.findByESN(esn).map { p =>
      Ok(views.html.products.detail(p)(messages, request.flash))
    }.getOrElse(NotFound)
  }

  def save: Action[AnyContent] = Action { implicit request =>
    val messages: Messages = messagesApi.preferred(request)
    val newProductForm = productForm.bindFromRequest()
    newProductForm.fold(
      hasErrors = { form =>
        Redirect(routes.Products.newProduct)
          .flashing(Flash(form.data) + ("error" -> messages.messages("validation.errors")))
      },

      success = { newProduct =>
        Product.add(newProduct)
        Redirect(routes.Products.show(newProduct.esn))
            .flashing("success" -> (messages.messages("products.new.success") + newProduct.name))
      }
    )
  }

  def newProduct: Action[AnyContent] = Action { implicit request =>
    val messages: Messages = messagesApi.preferred(request)
    val form =
      if (request.flash.get("error").isDefined)
        productForm.bind(request.flash.data)
      else
        productForm
    Ok(views.html.products.editProduct(form)(messages, request.flash, request))
  }

  def justJson(s: String): Action[AnyContent] = Action { implicit request =>
    import play.api.libs.json.Json
    val success = Map("status" -> "success")
    val value = Json.toJson(success)
    Ok(value)
  }

  val productForm: Form[Product] = Form(
    mapping(
      "esn" -> longNumber.verifying("validation.esn.duplication", Product.findByESN(_).isEmpty),
      "name" -> nonEmptyText,
      "description" -> nonEmptyText
    )(Product.apply)(Product.unapply)
  )
}
