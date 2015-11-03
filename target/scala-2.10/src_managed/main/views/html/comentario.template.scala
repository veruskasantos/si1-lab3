
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
object comentario extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Anuncio],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(anuncios: List[Anuncio]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.27*/("""

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
 
    <section id="telaComentario" >
    <div>
    <form action=""""),_display_(Seq[Any](/*25.20*/routes/*25.26*/.Application.index())),format.raw/*25.46*/("""">
    <input type="submit" class="btn btn-primary" value="Club Music - Início">
    </form>
    </div>
    <div class="content" align="center">

	<div class="col-sm-9" align="center">
    	<h2>Seção de perguntas e respostas</h2>
            <div class="table-responsive" align="center">
                <table class="table table-hover">
                    <thead>
                        <tr>
                            <th>Título do Anúncio </th>
                            <th>Pergunta</th>
                            <th>Resposta</th>
                            
                        </tr>
                    </thead>
                    <tbody>
                    """),_display_(Seq[Any](/*44.22*/for(anuncio <- anuncios) yield /*44.46*/ {_display_(Seq[Any](format.raw/*44.48*/("""
                        <tr>
                            <td>"""),_display_(Seq[Any](/*46.34*/anuncio/*46.41*/.getTitulo())),format.raw/*46.53*/("""</td>
                            <td> 
                                """),_display_(Seq[Any](/*48.34*/for(coment <- anuncio.getComentarios()) yield /*48.73*/ {_display_(Seq[Any](format.raw/*48.75*/("""
                                    <p> """),_display_(Seq[Any](/*49.42*/coment/*49.48*/.getDescricao())),format.raw/*49.63*/("""</p>
                                """)))})),format.raw/*50.34*/("""
                            </td>
                            <td>
                            	"""),_display_(Seq[Any](/*53.31*/for(resposta <- anuncio.getComentarios()) yield /*53.72*/ {_display_(Seq[Any](format.raw/*53.74*/("""
                                    <p> """),_display_(Seq[Any](/*54.42*/resposta/*54.50*/.getResposta())),format.raw/*54.64*/("""</p>
                            """)))})),format.raw/*55.30*/("""
                            </td>
                           
                        </tr>
                    """)))})),format.raw/*59.22*/("""
                    </tbody>
                </table>
            </div>
    </div>

	<div class="col-sm-3" align="center">
        <h3>Deseja fazer uma pergunta?</h3>
        
        <form action="/comentario/fazerPergunta" method="get">
        <label for="anuncio"> Selecione o anúncio</label>
        <select name="anuncio" id="inputAnuncio" class="form-control multiselect" required="required">
                     """),_display_(Seq[Any](/*71.23*/for(anuncio <- anuncios) yield /*71.47*/ {_display_(Seq[Any](format.raw/*71.49*/("""
                     <option value=""""),_display_(Seq[Any](/*72.38*/anuncio/*72.45*/.getId())),format.raw/*72.53*/("""">"""),_display_(Seq[Any](/*72.56*/anuncio/*72.63*/.getTitulo())),format.raw/*72.75*/("""</option>
               		""")))})),format.raw/*73.19*/("""
             </select>
        <label for="pergunta">Digite a pergunta</label>
        <input type="input" name="pergunta" class="form-control" required="required">
        
        <input type="submit" class="btn btn-danger" value="Adicionar Comentário">
        </form>
        
        </div>
        
        <div class="col-sm-3" align="center">
        <h3>Deseja responder uma pergunta do seu anúncio?</h3>
        
        <form action="/comentario/responderComentario" method="get">
        <label for="anuncio"> Selecione o anúncio</label>
        <select name="anuncio" id="inputAnuncio" class="form-control multiselect" required="required">
                     """),_display_(Seq[Any](/*89.23*/for(anuncio <- anuncios) yield /*89.47*/ {_display_(Seq[Any](format.raw/*89.49*/("""
                     <option value=""""),_display_(Seq[Any](/*90.38*/anuncio/*90.45*/.getId())),format.raw/*90.53*/("""">"""),_display_(Seq[Any](/*90.56*/anuncio/*90.63*/.getTitulo())),format.raw/*90.75*/("""</option>
               		""")))})),format.raw/*91.19*/("""
        </select>
        <label for="codigo">Digite o código do anúncio</label>
        <input type="input" name="codigo" class="form-control" required="required">
        
        <label for="comentario"> Selecione a pergunta</label>
        <select name="comentario" id="inputComentario" class="form-control multiselect" required="required">
                     """),_display_(Seq[Any](/*98.23*/for(anuncio <- anuncios) yield /*98.47*/ {_display_(Seq[Any](format.raw/*98.49*/("""
                     	"""),_display_(Seq[Any](/*99.24*/for(coment <- anuncio.getComentarios()) yield /*99.63*/{_display_(Seq[Any](format.raw/*99.64*/("""
                     	<option value=""""),_display_(Seq[Any](/*100.39*/coment/*100.45*/.getId())),format.raw/*100.53*/("""">"""),_display_(Seq[Any](/*100.56*/coment/*100.62*/.getDescricao())),format.raw/*100.77*/("""</option>
               			""")))})),format.raw/*101.20*/("""
               		""")))})),format.raw/*102.19*/("""
        </select>
        
        <label for="resposta">Digite a resposta</label>
        <input type="input" name="resposta" class="form-control" required="required">
        
        <input type="submit" class="btn btn-danger" value="Responder">
        </form>
        
        </div>
        
        </div>
        </section>
        </body>
</html>"""))}
    }
    
    def render(anuncios:List[Anuncio]): play.api.templates.HtmlFormat.Appendable = apply(anuncios)
    
    def f:((List[Anuncio]) => play.api.templates.HtmlFormat.Appendable) = (anuncios) => apply(anuncios)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Nov 02 23:32:26 BRST 2015
                    SOURCE: C:/Users/Veruska/workspace/si1-lab3/app/views/comentario.scala.html
                    HASH: 5461d461359326db15801b61de476334515ff60a
                    MATRIX: 786->1|905->26|1340->425|1355->431|1411->465|1509->527|1524->533|1577->564|1639->590|1654->596|1721->641|2057->941|2072->947|2114->967|2849->1666|2889->1690|2929->1692|3030->1757|3046->1764|3080->1776|3191->1851|3246->1890|3286->1892|3365->1935|3380->1941|3417->1956|3488->1995|3625->2096|3682->2137|3722->2139|3801->2182|3818->2190|3854->2204|3921->2239|4071->2357|4543->2793|4583->2817|4623->2819|4698->2858|4714->2865|4744->2873|4783->2876|4799->2883|4833->2895|4894->2924|5622->3616|5662->3640|5702->3642|5777->3681|5793->3688|5823->3696|5862->3699|5878->3706|5912->3718|5973->3747|6384->4122|6424->4146|6464->4148|6525->4173|6580->4212|6619->4213|6696->4253|6712->4259|6743->4267|6783->4270|6799->4276|6837->4291|6900->4321|6953->4341
                    LINES: 26->1|29->1|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|53->25|53->25|53->25|72->44|72->44|72->44|74->46|74->46|74->46|76->48|76->48|76->48|77->49|77->49|77->49|78->50|81->53|81->53|81->53|82->54|82->54|82->54|83->55|87->59|99->71|99->71|99->71|100->72|100->72|100->72|100->72|100->72|100->72|101->73|117->89|117->89|117->89|118->90|118->90|118->90|118->90|118->90|118->90|119->91|126->98|126->98|126->98|127->99|127->99|127->99|128->100|128->100|128->100|128->100|128->100|128->100|129->101|130->102
                    -- GENERATED --
                */
            