
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
object novo extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template5[List[Anuncio],List[Instrumento],List[Estilo],List[EstiloNO],Long,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(anuncios: List[Anuncio], instr : List[Instrumento], estilo : List[Estilo], estiloNG : List[EstiloNO], contador : Long):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.121*/("""

<!DOCTYPE: html>
<html lang="pt-br">

<head>
        <title id="titulo"> Club Music </title>
        <meta charset="UTF-8">
        <meta name=description content="">
        <meta name=viewport content="width=device-width, initial-scale=1">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
        
        <link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*14.55*/routes/*14.61*/.Assets.at("stylesheets/main.css"))),format.raw/*14.95*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*15.59*/routes/*15.65*/.Assets.at("images/violao.jpg"))),format.raw/*15.96*/("""">
        <script src=""""),_display_(Seq[Any](/*16.23*/routes/*16.29*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*16.74*/("""" type="text/javascript"></script>
        
        <h1> Bem vindo ao Club Music </h1>
        <!-- Bootstrap CSS -->
        <link href="http://netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css" rel="stylesheet" media="screen">
   </head>
   
   <body >
 
   
    <section id="telaInicial" >
    <div class="content" align="center">
    <h3>Site para formar bandas musicais ou encontrar parceiros para tocar casualmente.</h3>
    </div>
    
    <div class="col-sm-9" align="center">
    	<h2>Veja a lista de anúncios cadastrados</h2>
            <div class="table-responsive" align="center">
                <table class="table table-hover">
                    <thead>
                        <tr>
                        	<th>Data</th>
                            <th>Título </th>
                            <th>Descrição</th>
                            <th>Cidade</th>
                            <th>Bairro</th>
                            <th>Email</th>
                            <th>Facebook</th>
                            <th>Banda</th>
                            <th>Tocar</th>
                            <th>Instrumentos</th>
                            <th>EstilosG</th>
                            <th>EstilosNG</th>
                            
                        </tr>
                    </thead>
                    <tbody>
                    """),_display_(Seq[Any](/*53.22*/for(anuncio <- anuncios) yield /*53.46*/ {_display_(Seq[Any](format.raw/*53.48*/("""
                        <tr>
                        	<td>"""),_display_(Seq[Any](/*55.31*/anuncio/*55.38*/.getDataFormatada())),format.raw/*55.57*/("""</td>
                            <td>"""),_display_(Seq[Any](/*56.34*/anuncio/*56.41*/.getTitulo())),format.raw/*56.53*/("""</td>
                            <td>"""),_display_(Seq[Any](/*57.34*/anuncio/*57.41*/.getDescricao())),format.raw/*57.56*/("""</td>
                            <td>"""),_display_(Seq[Any](/*58.34*/anuncio/*58.41*/.getCidade())),format.raw/*58.53*/("""</td>
                            <td>"""),_display_(Seq[Any](/*59.34*/anuncio/*59.41*/.getBairro())),format.raw/*59.53*/("""</td>
                            <td>"""),_display_(Seq[Any](/*60.34*/anuncio/*60.41*/.getEmail())),format.raw/*60.52*/("""</td>
                            <td>"""),_display_(Seq[Any](/*61.34*/anuncio/*61.41*/.getFacebook())),format.raw/*61.55*/("""</td>
                            <td>"""),_display_(Seq[Any](/*62.34*/anuncio/*62.41*/.getBanda())),format.raw/*62.52*/("""</td>
                            <td>"""),_display_(Seq[Any](/*63.34*/anuncio/*63.41*/.getTocar())),format.raw/*63.52*/("""</td>
                            <td> 
                                """),_display_(Seq[Any](/*65.34*/for(instrument <- anuncio.getInstrumentos()) yield /*65.78*/ {_display_(Seq[Any](format.raw/*65.80*/("""
                                    <p> """),_display_(Seq[Any](/*66.42*/instrument/*66.52*/.getNome())),format.raw/*66.62*/("""</p>
                                """)))})),format.raw/*67.34*/("""
                            </td>
                            <td>
                            	"""),_display_(Seq[Any](/*70.31*/for(estiloG <- anuncio.getEstilosGosta()) yield /*70.72*/ {_display_(Seq[Any](format.raw/*70.74*/("""
                                    <p> """),_display_(Seq[Any](/*71.42*/estiloG/*71.49*/.getNome())),format.raw/*71.59*/("""</p>
                            """)))})),format.raw/*72.30*/("""
                            </td>
                            <td>
                            	"""),_display_(Seq[Any](/*75.31*/for(estiloNG <- anuncio.getEstilosNaoGosta()) yield /*75.76*/ {_display_(Seq[Any](format.raw/*75.78*/("""
                                    <p> """),_display_(Seq[Any](/*76.42*/estiloNG/*76.50*/.getNome())),format.raw/*76.60*/("""</p>
                            """)))})),format.raw/*77.30*/("""
                            </td>
                        </tr>
                    """)))})),format.raw/*80.22*/("""
                    </tbody>
                </table>
            </div>
            <h3 class="text-center">"""),_display_(Seq[Any](/*84.38*/contador)),format.raw/*84.46*/(""" anúncio(s) já ajudaram as pessoas</h3>
    <form action=""""),_display_(Seq[Any](/*85.20*/routes/*85.26*/.Application.anuncios())),format.raw/*85.49*/("""">
    <input type="submit" class="btn btn-primary" value="Criar Novo Anúncio">
    </form>
        </div>
        
        <div class="col-sm-3" align="center">
        <h3>Deseja excluir algum anúncio?</h3>
        
        <form action="/books/removeAnuncio" method="get">
        <label for="anuncio"> Selecione o anúncio</label>
        <select name="anuncio" id="inputAnuncio" class="form-control multiselect" required="required">
                     """),_display_(Seq[Any](/*96.23*/for(anuncio <- anuncios) yield /*96.47*/ {_display_(Seq[Any](format.raw/*96.49*/("""
                     <option value=""""),_display_(Seq[Any](/*97.38*/anuncio/*97.45*/.getId())),format.raw/*97.53*/("""">"""),_display_(Seq[Any](/*97.56*/anuncio/*97.63*/.getTitulo())),format.raw/*97.75*/("""</option>
               		""")))})),format.raw/*98.19*/("""
             </select>
        <label for="codigo">Digite o código do anúncio</label>
        <input type="input" name="codigo" class="form-control" required="required">
        
        <label for="satisfeito">Encontrou os parceiros que procurava?</label>
        <input type="input" name="satisfeito" class="form-control" placeholder="Sim ou Não" required="required">
        
        <input type="submit" class="btn btn-danger" value="Remover Anúncio">
        </form>
        </div>
    </section>
   
   <!-- jQuery -->
        <script src="http://code.jquery.com/jquery.js"></script>
        <!-- Bootstrap JavaScript -->
        <script src="http://netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
   </body>

</html>"""))}
    }
    
    def render(anuncios:List[Anuncio],instr:List[Instrumento],estilo:List[Estilo],estiloNG:List[EstiloNO],contador:Long): play.api.templates.HtmlFormat.Appendable = apply(anuncios,instr,estilo,estiloNG,contador)
    
    def f:((List[Anuncio],List[Instrumento],List[Estilo],List[EstiloNO],Long) => play.api.templates.HtmlFormat.Appendable) = (anuncios,instr,estilo,estiloNG,contador) => apply(anuncios,instr,estilo,estiloNG,contador)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Jun 05 18:37:56 BRT 2015
                    SOURCE: C:/Users/Veruska/si1-lab2/app/views/novo.scala.html
                    HASH: 43fd0b954a5b7201cd8f1a2c8cc818b8c1bcbd5c
                    MATRIX: 831->1|1045->120|1489->528|1504->534|1560->568|1658->630|1673->636|1726->667|1788->693|1803->699|1870->744|3330->2168|3370->2192|3410->2194|3508->2256|3524->2263|3565->2282|3641->2322|3657->2329|3691->2341|3767->2381|3783->2388|3820->2403|3896->2443|3912->2450|3946->2462|4022->2502|4038->2509|4072->2521|4148->2561|4164->2568|4197->2579|4273->2619|4289->2626|4325->2640|4401->2680|4417->2687|4450->2698|4526->2738|4542->2745|4575->2756|4686->2831|4746->2875|4786->2877|4865->2920|4884->2930|4916->2940|4987->2979|5124->3080|5181->3121|5221->3123|5300->3166|5316->3173|5348->3183|5415->3218|5552->3319|5613->3364|5653->3366|5732->3409|5749->3417|5781->3427|5848->3462|5969->3551|6120->3666|6150->3674|6246->3734|6261->3740|6306->3763|6812->4233|6852->4257|6892->4259|6967->4298|6983->4305|7013->4313|7052->4316|7068->4323|7102->4335|7163->4364
                    LINES: 26->1|29->1|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|81->53|81->53|81->53|83->55|83->55|83->55|84->56|84->56|84->56|85->57|85->57|85->57|86->58|86->58|86->58|87->59|87->59|87->59|88->60|88->60|88->60|89->61|89->61|89->61|90->62|90->62|90->62|91->63|91->63|91->63|93->65|93->65|93->65|94->66|94->66|94->66|95->67|98->70|98->70|98->70|99->71|99->71|99->71|100->72|103->75|103->75|103->75|104->76|104->76|104->76|105->77|108->80|112->84|112->84|113->85|113->85|113->85|124->96|124->96|124->96|125->97|125->97|125->97|125->97|125->97|125->97|126->98
                    -- GENERATED --
                */
            