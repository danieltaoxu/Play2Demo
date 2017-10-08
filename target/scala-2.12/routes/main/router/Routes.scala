
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/tao/Projet/Play2Demo/conf/routes
// @DATE:Sun Sep 17 12:00:26 CEST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  Application_2: controllers.Application,
  // @LINE:8
  Products_0: controllers.Products,
  // @LINE:12
  Barcode_3: controllers.Barcode,
  // @LINE:22
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    Application_2: controllers.Application,
    // @LINE:8
    Products_0: controllers.Products,
    // @LINE:12
    Barcode_3: controllers.Barcode,
    // @LINE:22
    Assets_1: controllers.Assets
  ) = this(errorHandler, Application_2, Products_0, Barcode_3, Assets_1, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_2, Products_0, Barcode_3, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products""", """controllers.Products.list"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products/createProduct""", """controllers.Products.newProduct"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products""", """controllers.Products.save"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products/""" + "$" + """esn<\d{13}>""", """controllers.Products.show(esn:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """barcode/""" + "$" + """esn<[^/]+>""", """controllers.Barcode.barcode(esn:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products/""" + "$" + """s<[^/]+>""", """controllers.Products.justJson(s:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_2.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Products_list1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products")))
  )
  private[this] lazy val controllers_Products_list1_invoker = createInvoker(
    Products_0.list,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Products",
      "list",
      Nil,
      "GET",
      this.prefix + """products""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Products_newProduct2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products/createProduct")))
  )
  private[this] lazy val controllers_Products_newProduct2_invoker = createInvoker(
    Products_0.newProduct,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Products",
      "newProduct",
      Nil,
      "GET",
      this.prefix + """products/createProduct""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Products_save3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products")))
  )
  private[this] lazy val controllers_Products_save3_invoker = createInvoker(
    Products_0.save,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Products",
      "save",
      Nil,
      "POST",
      this.prefix + """products""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Products_show4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products/"), DynamicPart("esn", """\d{13}""",false)))
  )
  private[this] lazy val controllers_Products_show4_invoker = createInvoker(
    Products_0.show(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Products",
      "show",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """products/""" + "$" + """esn<\d{13}>""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_Barcode_barcode5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("barcode/"), DynamicPart("esn", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Barcode_barcode5_invoker = createInvoker(
    Barcode_3.barcode(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Barcode",
      "barcode",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """barcode/""" + "$" + """esn<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Products_justJson6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products/"), DynamicPart("s", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Products_justJson6_invoker = createInvoker(
    Products_0.justJson(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Products",
      "justJson",
      Seq(classOf[String]),
      "GET",
      this.prefix + """products/""" + "$" + """s<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_Assets_versioned7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned7_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_2.index)
      }
  
    // @LINE:8
    case controllers_Products_list1_route(params) =>
      call { 
        controllers_Products_list1_invoker.call(Products_0.list)
      }
  
    // @LINE:9
    case controllers_Products_newProduct2_route(params) =>
      call { 
        controllers_Products_newProduct2_invoker.call(Products_0.newProduct)
      }
  
    // @LINE:10
    case controllers_Products_save3_route(params) =>
      call { 
        controllers_Products_save3_invoker.call(Products_0.save)
      }
  
    // @LINE:11
    case controllers_Products_show4_route(params) =>
      call(params.fromPath[Long]("esn", None)) { (esn) =>
        controllers_Products_show4_invoker.call(Products_0.show(esn))
      }
  
    // @LINE:12
    case controllers_Barcode_barcode5_route(params) =>
      call(params.fromPath[Long]("esn", None)) { (esn) =>
        controllers_Barcode_barcode5_invoker.call(Barcode_3.barcode(esn))
      }
  
    // @LINE:13
    case controllers_Products_justJson6_route(params) =>
      call(params.fromPath[String]("s", None)) { (s) =>
        controllers_Products_justJson6_invoker.call(Products_0.justJson(s))
      }
  
    // @LINE:22
    case controllers_Assets_versioned7_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned7_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
