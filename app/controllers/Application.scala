package controllers

import javax.inject.Inject
import org.slf4j.LoggerFactory
import play.api.i18n.{Lang, Langs, Messages}
import play.api.mvc.{AbstractController, Action, AnyContent, ControllerComponents, Cookie}

class Application @Inject()(cc: ControllerComponents, langs: Langs) extends AbstractController(cc) with play.api.i18n.I18nSupport {
  val lang: Lang = langs.availables.head
  // implicit val messages: Messages = MessagesImpl(lang, messagesApi)
  val logger = LoggerFactory.getLogger(getClass)

  def index: Action[AnyContent] = Action { implicit request =>
    val messages: Messages = messagesApi.preferred(request)
    val message: String = messages("application.name")
    // Redirect(routes.Products.list)
    Ok(views.html.index(message))
  }

  def hello(name: String): Action[AnyContent] = Action {
    logger.info("------------------------------------------------------------------------------")
    Ok(s"Hello $name !")
      .withCookies(Cookie("response", "ok"))
      .bakeCookies()
  }

  def helloView() = Action { implicit request =>
    println(s"$request \n ${request.cookies} \n ${request.cookies.get("PLAY_SESSION")}")
    Ok(views.html.hello("Bob"))
  }
}
