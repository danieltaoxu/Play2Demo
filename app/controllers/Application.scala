package controllers

import javax.inject.Inject

import play.api.i18n.{Lang, Langs, Messages, MessagesImpl}
import play.api.mvc.{AbstractController, ControllerComponents}

class Application @Inject()(cc: ControllerComponents, langs: Langs) extends AbstractController(cc)  with play.api.i18n.I18nSupport {
  val lang: Lang = langs.availables.head
  implicit val messages: Messages = MessagesImpl(lang, messagesApi)

  def index = Action { implicit request =>
    //val messages: Messages = messagesApi.preferred(request)
    //val message: String = messages("application.name")
    Redirect(routes.Products.list)
    //Ok(views.html.index(message))
  }
}
