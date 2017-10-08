
package views.html.tags

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

object barcode extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Long,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(esn: Long):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.13*/("""

"""),format.raw/*3.1*/("""<img class="barcode" alt=""""),_display_(/*3.28*/esn),format.raw/*3.31*/("""" src=""""),_display_(/*3.39*/routes/*3.45*/.Barcode.barcode(esn)),format.raw/*3.66*/("""">"""))
      }
    }
  }

  def render(esn:Long): play.twirl.api.HtmlFormat.Appendable = apply(esn)

  def f:((Long) => play.twirl.api.HtmlFormat.Appendable) = (esn) => apply(esn)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Sep 11 22:31:00 CEST 2017
                  SOURCE: /Users/tao/Projet/Play2Demo/app/views/tags/barcode.scala.html
                  HASH: 2d362815de169673500b38431e96b6c535735900
                  MATRIX: 734->1|840->12|868->14|921->41|944->44|978->52|992->58|1033->79
                  LINES: 21->1|26->1|28->3|28->3|28->3|28->3|28->3|28->3
                  -- GENERATED --
              */
          