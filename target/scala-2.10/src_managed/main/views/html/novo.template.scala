
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
        
        <h1> Bem vindo ao Club Music</h1>
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
                    """),_display_(Seq[Any](/*52.22*/for(anuncio <- anuncios) yield /*52.46*/ {_display_(Seq[Any](format.raw/*52.48*/("""
                        <tr>
                        	<td>"""),_display_(Seq[Any](/*54.31*/anuncio/*54.38*/.getDataFormatada())),format.raw/*54.57*/("""</td>
                            <td>"""),_display_(Seq[Any](/*55.34*/anuncio/*55.41*/.getTitulo())),format.raw/*55.53*/("""</td>
                            <td>"""),_display_(Seq[Any](/*56.34*/anuncio/*56.41*/.getDescricao())),format.raw/*56.56*/("""</td>
                            <td>"""),_display_(Seq[Any](/*57.34*/anuncio/*57.41*/.getCidade())),format.raw/*57.53*/("""</td>
                            <td>"""),_display_(Seq[Any](/*58.34*/anuncio/*58.41*/.getBairro())),format.raw/*58.53*/("""</td>
                            <td>"""),_display_(Seq[Any](/*59.34*/anuncio/*59.41*/.getEmail())),format.raw/*59.52*/("""</td>
                            <td>"""),_display_(Seq[Any](/*60.34*/anuncio/*60.41*/.getFacebook())),format.raw/*60.55*/("""</td>
                            <td>"""),_display_(Seq[Any](/*61.34*/anuncio/*61.41*/.getBanda())),format.raw/*61.52*/("""</td>
                            <td>"""),_display_(Seq[Any](/*62.34*/anuncio/*62.41*/.getTocar())),format.raw/*62.52*/("""</td>
                            <td> 
                                """),_display_(Seq[Any](/*64.34*/for(instrument <- anuncio.getInstrumentos()) yield /*64.78*/ {_display_(Seq[Any](format.raw/*64.80*/("""
                                    <p> """),_display_(Seq[Any](/*65.42*/instrument/*65.52*/.getNome())),format.raw/*65.62*/("""</p>
                                """)))})),format.raw/*66.34*/("""
                            </td>
                            <td>
                            	"""),_display_(Seq[Any](/*69.31*/for(estiloG <- anuncio.getEstilosGosta()) yield /*69.72*/ {_display_(Seq[Any](format.raw/*69.74*/("""
                                    <p> """),_display_(Seq[Any](/*70.42*/estiloG/*70.49*/.getNome())),format.raw/*70.59*/("""</p>
                            """)))})),format.raw/*71.30*/("""
                            </td>
                            <td>
                            	"""),_display_(Seq[Any](/*74.31*/for(estiloNG <- anuncio.getEstilosNaoGosta()) yield /*74.76*/ {_display_(Seq[Any](format.raw/*74.78*/("""
                                    <p> """),_display_(Seq[Any](/*75.42*/estiloNG/*75.50*/.getNome())),format.raw/*75.60*/("""</p>
                            """)))})),format.raw/*76.30*/("""
                            </td>
                        </tr>
                    """)))})),format.raw/*79.22*/("""
                    </tbody>
                </table>
            </div>
            <h3 class="text-center">"""),_display_(Seq[Any](/*83.38*/contador)),format.raw/*83.46*/(""" anúncio(s) já ajudaram as pessoas</h3>
    <form action=""""),_display_(Seq[Any](/*84.20*/routes/*84.26*/.Application.anuncios())),format.raw/*84.49*/("""">
    <input type="submit" class="btn btn-primary" value="Criar Novo Anúncio">
    </form>
    
    <form action=""""),_display_(Seq[Any](/*88.20*/routes/*88.26*/.Application.redirecionaRemoveAnuncio())),format.raw/*88.65*/("""">
    <input type="submit" class="btn btn-primary" value="Excluir Anúncio">
    </form>
        </div>
        
        <div class="col-sm-3" align="center">
        <br><br><br><br>
        <form action="/books/retornaBusca" method="get">
        <label for="palavra"> Palavra-chave:</label>
        <input type="input" name="palavra" class="form-control" required="required">
        
        <label for="instrumentos">Instrumento:</label>
        <select name="instrumentos" id="inputInstrumento" class="form-control multiselect" required="required">
                     """),_display_(Seq[Any](/*101.23*/for(inst <- instr) yield /*101.41*/ {_display_(Seq[Any](format.raw/*101.43*/("""
                     <option value=""""),_display_(Seq[Any](/*102.38*/inst/*102.42*/.getId())),format.raw/*102.50*/("""">"""),_display_(Seq[Any](/*102.53*/inst/*102.57*/.getNome())),format.raw/*102.67*/("""</option>
               		""")))})),format.raw/*103.19*/("""    
       </select>
             
        <label for="estilosG">Estilo:</label>
        <select name="estilosG" id="inputEstilo" class="form-control multiselect" required="required">
                     """),_display_(Seq[Any](/*108.23*/for(estilo <- estilo) yield /*108.44*/ {_display_(Seq[Any](format.raw/*108.46*/("""
                     <option value=""""),_display_(Seq[Any](/*109.38*/estilo/*109.44*/.getId())),format.raw/*109.52*/("""">"""),_display_(Seq[Any](/*109.55*/estilo/*109.61*/.getNome())),format.raw/*109.71*/("""</option>
               		""")))})),format.raw/*110.19*/("""
        </select>
        
        <label for="interesse">Interesse:</label>
        <input type="input" name="interesse" class="form-control" placeholder="Formar banda ou Tocar por ocasião" required="required">
        
        <input type="submit" class="btn btn-danger" value="Buscar">
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
                    DATE: Wed Oct 28 23:58:45 BRST 2015
                    SOURCE: C:/Users/Veruska/workspace/si1-lab3/app/views/novo.scala.html
                    HASH: 5b31ca4e19ea6e19c2d50ba7b0ae90037e7a9635
                    MATRIX: 831->1|1045->120|1489->528|1504->534|1560->568|1658->630|1673->636|1726->667|1788->693|1803->699|1870->744|3323->2161|3363->2185|3403->2187|3501->2249|3517->2256|3558->2275|3634->2315|3650->2322|3684->2334|3760->2374|3776->2381|3813->2396|3889->2436|3905->2443|3939->2455|4015->2495|4031->2502|4065->2514|4141->2554|4157->2561|4190->2572|4266->2612|4282->2619|4318->2633|4394->2673|4410->2680|4443->2691|4519->2731|4535->2738|4568->2749|4679->2824|4739->2868|4779->2870|4858->2913|4877->2923|4909->2933|4980->2972|5117->3073|5174->3114|5214->3116|5293->3159|5309->3166|5341->3176|5408->3211|5545->3312|5606->3357|5646->3359|5725->3402|5742->3410|5774->3420|5841->3455|5962->3544|6113->3659|6143->3667|6239->3727|6254->3733|6299->3756|6455->3876|6470->3882|6531->3921|7158->4511|7193->4529|7234->4531|7310->4570|7324->4574|7355->4582|7395->4585|7409->4589|7442->4599|7504->4628|7753->4840|7791->4861|7832->4863|7908->4902|7924->4908|7955->4916|7995->4919|8011->4925|8044->4935|8106->4964
                    LINES: 26->1|29->1|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|80->52|80->52|80->52|82->54|82->54|82->54|83->55|83->55|83->55|84->56|84->56|84->56|85->57|85->57|85->57|86->58|86->58|86->58|87->59|87->59|87->59|88->60|88->60|88->60|89->61|89->61|89->61|90->62|90->62|90->62|92->64|92->64|92->64|93->65|93->65|93->65|94->66|97->69|97->69|97->69|98->70|98->70|98->70|99->71|102->74|102->74|102->74|103->75|103->75|103->75|104->76|107->79|111->83|111->83|112->84|112->84|112->84|116->88|116->88|116->88|129->101|129->101|129->101|130->102|130->102|130->102|130->102|130->102|130->102|131->103|136->108|136->108|136->108|137->109|137->109|137->109|137->109|137->109|137->109|138->110
                    -- GENERATED --
                */
            