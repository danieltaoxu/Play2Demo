
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

object detail extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Product,MessagesProvider,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(product: Product)(implicit messages: MessagesProvider, flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.71*/("""

"""),_display_(/*3.2*/main(messages.messages("details") + product.name)/*3.51*/ {_display_(Seq[Any](format.raw/*3.53*/("""
  """),format.raw/*4.3*/("""<h2>
    """),_display_(/*5.6*/tags/*5.10*/.barcode(product.esn)),format.raw/*5.31*/("""
    """),_display_(/*6.6*/product/*6.13*/.name),format.raw/*6.18*/(""" """),format.raw/*6.19*/("""detail
  </h2>

  <dl class="dl-horizontal">
    <dt>"""),_display_(/*10.10*/messages/*10.18*/.messages("esn")),format.raw/*10.34*/("""</dt>
    <dd>"""),_display_(/*11.10*/product/*11.17*/.esn),format.raw/*11.21*/("""</dd>
    <dt>"""),_display_(/*12.10*/messages/*12.18*/.messages("name")),format.raw/*12.35*/("""</dt>
    <dd>"""),_display_(/*13.10*/product/*13.17*/.name),format.raw/*13.22*/("""</dd>
    <dt>"""),_display_(/*14.10*/messages/*14.18*/.messages("description")),format.raw/*14.42*/("""</dt>
    <dd>"""),_display_(/*15.10*/product/*15.17*/.description),format.raw/*15.29*/("""</dd>
  </dl>
""")))}))
      }
    }
  }

  def render(product:Product,messages:MessagesProvider,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(product)(messages,flash)

  def f:((Product) => (MessagesProvider,Flash) => play.twirl.api.HtmlFormat.Appendable) = (product) => (messages,flash) => apply(product)(messages,flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Sep 12 21:44:39 CEST 2017
                  SOURCE: /Users/tao/Projet/Play2Demo/app/views/products/detail.scala.html
                  HASH: 7681f128da48520523f02ad83d536f194c1f5295
                  MATRIX: 763->1|927->70|955->73|1012->122|1051->124|1080->127|1115->137|1127->141|1168->162|1199->168|1214->175|1239->180|1267->181|1348->235|1365->243|1402->259|1444->274|1460->281|1485->285|1527->300|1544->308|1582->325|1624->340|1640->347|1666->352|1708->367|1725->375|1770->399|1812->414|1828->421|1861->433
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|30->5|30->5|30->5|31->6|31->6|31->6|31->6|35->10|35->10|35->10|36->11|36->11|36->11|37->12|37->12|37->12|38->13|38->13|38->13|39->14|39->14|39->14|40->15|40->15|40->15
                  -- GENERATED --
              */
          