
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
/*1.2*/import play.api.Configuration

object debug extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Configuration,Lang,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(config: Configuration, lang: Lang):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.37*/("""

"""),format.raw/*4.1*/("""<footer>
  lang = """),_display_(/*5.11*/config),format.raw/*5.17*/("""
"""),format.raw/*6.1*/("""</footer>"""))
      }
    }
  }

  def render(config:Configuration,lang:Lang): play.twirl.api.HtmlFormat.Appendable = apply(config,lang)

  def f:((Configuration,Lang) => play.twirl.api.HtmlFormat.Appendable) = (config,lang) => apply(config,lang)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Sep 10 19:09:58 CEST 2017
                  SOURCE: /Users/tao/Projet/Play2Demo/app/views/debug.scala.html
                  HASH: 07b7ef847c4b3bdd5a707aceab96ea657bd12530
                  MATRIX: 432->1|778->32|908->67|936->69|981->88|1007->94|1034->95
                  LINES: 17->1|22->2|27->2|29->4|30->5|30->5|31->6
                  -- GENERATED --
              */
          