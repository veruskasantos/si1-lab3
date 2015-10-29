
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object removeAnuncio extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[Anuncio],Long,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(anuncios: List[Anuncio], contador : Long):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.44*/("""

<!DOCTYPE: html>
<html lang="pt-br">

	<head>
        <title id="titulo"> Club Music </title>
        <meta charset="UTF-8">
        <meta name=description content="">
        <meta name=viewport content="width=device-width, initial-scale=1">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
        <link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*13.55*/routes/*13.61*/.Assets.at("stylesheets/main.css"))),format.raw/*13.95*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*14.59*/routes/*14.65*/.Assets.at("images/violao.jpg"))),format.raw/*14.96*/("""">
        <script src=""""),_display_(Seq[Any](/*15.23*/routes/*15.29*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*15.74*/("""" type="text/javascript"></script>
        
        <!-- Bootstrap CSS -->
        <link href="http://netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css" rel="stylesheet" media="screen">
   </head>
   
   <body >
 
    <section id="telaRemoveAnuncio" >
    <div class="content" align="center">

	<div class="col-sm-3" align="center">
        <h3>Deseja excluir algum anúncio?</h3>
        
        <form action="/books/removeAnuncio" method="get">
        <label for="anuncio"> Selecione o anúncio</label>
        <select name="anuncio" id="inputAnuncio" class="form-control multiselect" required="required">
                     """),_display_(Seq[Any](/*32.23*/for(anuncio <- anuncios) yield /*32.47*/ {_display_(Seq[Any](format.raw/*32.49*/("""
                     <option value=""""),_display_(Seq[Any](/*33.38*/anuncio/*33.45*/.getId())),format.raw/*33.53*/("""">"""),_display_(Seq[Any](/*33.56*/anuncio/*33.63*/.getTitulo())),format.raw/*33.75*/("""</option>
               		""")))})),format.raw/*34.19*/("""
             </select>
        <label for="codigo">Digite o código do anúncio</label>
        <input type="input" name="codigo" class="form-control" required="required">
        
        <label for="satisfeito">Encontrou os parceiros que procurava?</label>
        <input type="input" name="satisfeito" class="form-control" placeholder="Sim ou Não" required="required">
        
        <input type="submit" class="btn btn-danger" value="Remover Anúncio">
        </form>
        
        </div>
        </div>
        </section>
        </body>
</html>"""))}
    }
    
    def render(anuncios:List[Anuncio],contador:Long): play.api.templates.HtmlFormat.Appendable = apply(anuncios,contador)
    
    def f:((List[Anuncio],Long) => play.api.templates.HtmlFormat.Appendable) = (anuncios,contador) => apply(anuncios,contador)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Oct 28 23:58:45 BRST 2015
                    SOURCE: C:/Users/Veruska/workspace/si1-lab3/app/views/removeAnuncio.scala.html
                    HASH: 2a4af2ceb7769c17014cb341d998877e0a6fdc19
                    MATRIX: 794->1|930->43|1365->442|1380->448|1436->482|1534->544|1549->550|1602->581|1664->607|1679->613|1746->658|2441->1317|2481->1341|2521->1343|2596->1382|2612->1389|2642->1397|2681->1400|2697->1407|2731->1419|2792->1448
                    LINES: 26->1|29->1|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|60->32|60->32|60->32|61->33|61->33|61->33|61->33|61->33|61->33|62->34
                    -- GENERATED --
                */
            