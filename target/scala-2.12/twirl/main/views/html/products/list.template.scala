
package views.html.products

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

object list extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[Product],MessagesProvider,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[Product])(implicit messages: MessagesProvider, flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.78*/("""

"""),_display_(/*3.2*/main("Product")/*3.17*/ {_display_(Seq[Any](format.raw/*3.19*/("""
  """),format.raw/*4.3*/("""<dl class="products">
  """),_display_(/*5.4*/for(product <- products) yield /*5.28*/ {_display_(Seq[Any](format.raw/*5.30*/("""
    """),format.raw/*6.5*/("""<dt><a href=""""),_display_(/*6.19*/routes/*6.25*/.Products.show(product.esn)),format.raw/*6.52*/("""">"""),_display_(/*6.55*/product/*6.62*/.name),format.raw/*6.67*/("""</a> </dt>
    <dd>"""),_display_(/*7.10*/product/*7.17*/.description),format.raw/*7.29*/("""</dd>
  """)))}),format.raw/*8.4*/(""" """),format.raw/*8.5*/("""</dl>

  <p>
    <a href=""""),_display_(/*11.15*/controllers/*11.26*/.routes.Products.newProduct()),format.raw/*11.55*/(""""
    class="btn">
      <i class="icon-plus"></i> """),_display_(/*13.34*/Messages("products.new.command")),format.raw/*13.66*/("""</a>
  </p>
""")))}))
      }
    }
  }

  def render(products:List[Product],messages:MessagesProvider,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(products)(messages,flash)

  def f:((List[Product]) => (MessagesProvider,Flash) => play.twirl.api.HtmlFormat.Appendable) = (products) => (messages,flash) => apply(products)(messages,flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Sep 12 00:25:14 CEST 2017
                  SOURCE: /Users/tao/Projet/Play2Demo/app/views/products/list.scala.html
                  HASH: 8469f9a222c5b22dca10cf38f90b52f5cca30b96
                  MATRIX: 767->1|938->77|966->80|989->95|1028->97|1057->100|1107->125|1146->149|1185->151|1216->156|1256->170|1270->176|1317->203|1346->206|1361->213|1386->218|1432->238|1447->245|1479->257|1517->266|1544->267|1598->294|1618->305|1668->334|1747->386|1800->418
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|30->5|30->5|30->5|31->6|31->6|31->6|31->6|31->6|31->6|31->6|32->7|32->7|32->7|33->8|33->8|36->11|36->11|36->11|38->13|38->13
                  -- GENERATED --
              */
          