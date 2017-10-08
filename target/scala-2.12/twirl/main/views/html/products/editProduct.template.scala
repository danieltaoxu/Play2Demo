
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

object editProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Form[Product],MessagesProvider,Flash,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(productForm: Form[Product])(implicit messages: MessagesProvider, flash: Flash, requestHeader: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.111*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Edit Product")/*4.22*/ {_display_(Seq[Any](format.raw/*4.24*/("""
  """),format.raw/*5.3*/("""<h2>"""),_display_(/*5.8*/messages/*5.16*/.messages("products.form")),format.raw/*5.42*/("""</h2>
  """),_display_(/*6.4*/form(action = CSRF(routes.Products.save()))/*6.47*/ {_display_(Seq[Any](format.raw/*6.49*/("""
    """),format.raw/*7.5*/("""<fieldset>
      <legend>
        Product """),_display_(/*9.18*/messages/*9.26*/.messages("products.new")),format.raw/*9.51*/("""
      """),format.raw/*10.7*/("""</legend>
        """),_display_(/*11.10*/inputText(productForm("esn"))),format.raw/*11.39*/("""
        """),_display_(/*12.10*/inputText(productForm("name"))),format.raw/*12.40*/("""
        """),_display_(/*13.10*/textarea(productForm("description"))),format.raw/*13.46*/("""
    """),format.raw/*14.5*/("""</fieldset>
    <p><input type="submit" class="btn primary"
    value='"""),_display_(/*16.13*/messages/*16.21*/.messages("products.new.submit")),format.raw/*16.53*/("""'></p>
  """)))}),format.raw/*17.4*/("""
""")))}))
      }
    }
  }

  def render(productForm:Form[Product],messages:MessagesProvider,flash:Flash,requestHeader:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(productForm)(messages,flash,requestHeader)

  def f:((Form[Product]) => (MessagesProvider,Flash,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (productForm) => (messages,flash,requestHeader) => apply(productForm)(messages,flash,requestHeader)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Sep 12 21:44:39 CEST 2017
                  SOURCE: /Users/tao/Projet/Play2Demo/app/views/products/editProduct.scala.html
                  HASH: ba9c8a4e5967bce6c61fc53c000fd8f4d3e07a13
                  MATRIX: 788->1|970->112|1016->110|1043->128|1070->130|1098->150|1137->152|1166->155|1196->160|1212->168|1258->194|1292->203|1343->246|1382->248|1413->253|1482->296|1498->304|1543->329|1577->336|1623->355|1673->384|1710->394|1761->424|1798->434|1855->470|1887->475|1986->547|2003->555|2056->587|2096->597
                  LINES: 21->1|24->2|27->1|28->3|29->4|29->4|29->4|30->5|30->5|30->5|30->5|31->6|31->6|31->6|32->7|34->9|34->9|34->9|35->10|36->11|36->11|37->12|37->12|38->13|38->13|39->14|41->16|41->16|41->16|42->17
                  -- GENERATED --
              */
          