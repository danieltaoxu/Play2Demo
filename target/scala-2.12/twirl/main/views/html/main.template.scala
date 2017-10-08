
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[String,Html,MessagesProvider,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html)(implicit messages: MessagesProvider, flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.83*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*12.62*/("""
        """),format.raw/*13.9*/("""<title>"""),_display_(/*13.17*/title),format.raw/*13.22*/("""</title>
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*14.70*/routes/*14.76*/.Assets.versioned("stylesheets/bootstrap.css")),format.raw/*14.122*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*15.54*/routes/*15.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*15.101*/("""">
    </head>
    <body>
        <div class="screenshot">
            <div class="navbar navbar-fixed-top">
                <div class="navbar-inner">
                    <div class="container">
                        <a class="brand" href=""""),_display_(/*22.49*/routes/*22.55*/.Application.index()),format.raw/*22.75*/("""">
                            """),_display_(/*23.30*/messages/*23.38*/.messages("application.name")),format.raw/*23.67*/("""
                        """),format.raw/*24.25*/("""</a>

                        <ul class="nav">
                            <li class="divider-vertical"></li>

                            <li class="active">
                                <a href=""""),_display_(/*30.43*/routes/*30.49*/.Products.list()),format.raw/*30.65*/("""">
                                    Products
                                </a>
                            </li>

                            <li class="active">
                                <a href class=""""),_display_(/*36.49*/routes/*36.55*/.Products.newProduct()),format.raw/*36.77*/("""">
                                    """),_display_(/*37.38*/messages/*37.46*/.messages("products.new.command")),format.raw/*37.79*/("""
                                """),format.raw/*38.33*/("""</a>
                            </li>

                            <li class="divider-vertical"></li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
        """),format.raw/*48.32*/("""
        """),format.raw/*49.9*/("""<div class="container">
            """),_display_(/*50.14*/content),format.raw/*50.21*/("""

            """),_display_(/*52.14*/if(flash.get("success").isDefined)/*52.48*/{_display_(Seq[Any](format.raw/*52.49*/("""
                """),format.raw/*53.17*/("""<div class="alert alert-success">
                """),_display_(/*54.18*/flash/*54.23*/.get("success")),format.raw/*54.38*/("""
                """),format.raw/*55.17*/("""</div> """)))}),format.raw/*55.25*/("""
            """),_display_(/*56.14*/if(flash.get("error").isDefined)/*56.46*/{_display_(Seq[Any](format.raw/*56.47*/("""
                """),format.raw/*57.17*/("""<div class="alert alert-error">
                """),_display_(/*58.18*/flash/*58.23*/.get("error")),format.raw/*58.36*/("""
                """),format.raw/*59.17*/("""</div>
            """)))}),format.raw/*60.14*/("""
        """),format.raw/*61.9*/("""</div>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html,messages:MessagesProvider,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)(messages,flash)

  def f:((String) => (Html) => (MessagesProvider,Flash) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => (messages,flash) => apply(title)(content)(messages,flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Sep 12 00:47:48 CEST 2017
                  SOURCE: /Users/tao/Projet/Play2Demo/app/views/main.scala.html
                  HASH: b5471e5379cb5d27a70b051029c2a655ceae7b53
                  MATRIX: 1010->260|1186->341|1214->343|1294->448|1330->457|1365->465|1391->470|1496->548|1511->554|1579->600|1662->656|1677->662|1740->703|2011->947|2026->953|2067->973|2126->1005|2143->1013|2193->1042|2246->1067|2474->1268|2489->1274|2526->1290|2769->1506|2784->1512|2827->1534|2894->1574|2911->1582|2965->1615|3026->1648|3279->1963|3315->1972|3379->2009|3407->2016|3449->2031|3492->2065|3531->2066|3576->2083|3654->2134|3668->2139|3704->2154|3749->2171|3788->2179|3829->2193|3870->2225|3909->2226|3954->2243|4030->2292|4044->2297|4078->2310|4123->2327|4174->2347|4210->2356
                  LINES: 26->7|31->7|33->9|36->12|37->13|37->13|37->13|38->14|38->14|38->14|39->15|39->15|39->15|46->22|46->22|46->22|47->23|47->23|47->23|48->24|54->30|54->30|54->30|60->36|60->36|60->36|61->37|61->37|61->37|62->38|71->48|72->49|73->50|73->50|75->52|75->52|75->52|76->53|77->54|77->54|77->54|78->55|78->55|79->56|79->56|79->56|80->57|81->58|81->58|81->58|82->59|83->60|84->61
                  -- GENERATED --
              */
          