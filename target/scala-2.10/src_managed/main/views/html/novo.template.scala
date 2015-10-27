
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
    
    <form action=""""),_display_(Seq[Any](/*89.20*/routes/*89.26*/.Application.redirecionaRemoveAnuncio())),format.raw/*89.65*/("""">
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
                     """),_display_(Seq[Any](/*102.23*/for(inst <- instr) yield /*102.41*/ {_display_(Seq[Any](format.raw/*102.43*/("""
                     <option value=""""),_display_(Seq[Any](/*103.38*/inst/*103.42*/.getId())),format.raw/*103.50*/("""">"""),_display_(Seq[Any](/*103.53*/inst/*103.57*/.getNome())),format.raw/*103.67*/("""</option>
               		""")))})),format.raw/*104.19*/("""    
       </select>
             
        <label for="estilosG">Estilo:</label>
        <select name="estilosG" id="inputEstilo" class="form-control multiselect" required="required">
                     """),_display_(Seq[Any](/*109.23*/for(estilo <- estilo) yield /*109.44*/ {_display_(Seq[Any](format.raw/*109.46*/("""
                     <option value=""""),_display_(Seq[Any](/*110.38*/estilo/*110.44*/.getId())),format.raw/*110.52*/("""">"""),_display_(Seq[Any](/*110.55*/estilo/*110.61*/.getNome())),format.raw/*110.71*/("""</option>
               		""")))})),format.raw/*111.19*/("""
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
                    DATE: Mon Oct 26 23:52:59 BRST 2015
                    SOURCE: C:/Users/Veruska/workspace/si1-lab3/app/views/novo.scala.html
                    HASH: 464a856a86682490ba4cee75d83e90ab0091cb23
                    MATRIX: 831->1|1045->120|1489->528|1504->534|1560->568|1658->630|1673->636|1726->667|1788->693|1803->699|1870->744|3329->2167|3369->2191|3409->2193|3507->2255|3523->2262|3564->2281|3640->2321|3656->2328|3690->2340|3766->2380|3782->2387|3819->2402|3895->2442|3911->2449|3945->2461|4021->2501|4037->2508|4071->2520|4147->2560|4163->2567|4196->2578|4272->2618|4288->2625|4324->2639|4400->2679|4416->2686|4449->2697|4525->2737|4541->2744|4574->2755|4685->2830|4745->2874|4785->2876|4864->2919|4883->2929|4915->2939|4986->2978|5123->3079|5180->3120|5220->3122|5299->3165|5315->3172|5347->3182|5414->3217|5551->3318|5612->3363|5652->3365|5731->3408|5748->3416|5780->3426|5847->3461|5968->3550|6119->3665|6149->3673|6245->3733|6260->3739|6305->3762|6461->3882|6476->3888|6537->3927|7164->4517|7199->4535|7240->4537|7316->4576|7330->4580|7361->4588|7401->4591|7415->4595|7448->4605|7510->4634|7759->4846|7797->4867|7838->4869|7914->4908|7930->4914|7961->4922|8001->4925|8017->4931|8050->4941|8112->4970
                    LINES: 26->1|29->1|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|81->53|81->53|81->53|83->55|83->55|83->55|84->56|84->56|84->56|85->57|85->57|85->57|86->58|86->58|86->58|87->59|87->59|87->59|88->60|88->60|88->60|89->61|89->61|89->61|90->62|90->62|90->62|91->63|91->63|91->63|93->65|93->65|93->65|94->66|94->66|94->66|95->67|98->70|98->70|98->70|99->71|99->71|99->71|100->72|103->75|103->75|103->75|104->76|104->76|104->76|105->77|108->80|112->84|112->84|113->85|113->85|113->85|117->89|117->89|117->89|130->102|130->102|130->102|131->103|131->103|131->103|131->103|131->103|131->103|132->104|137->109|137->109|137->109|138->110|138->110|138->110|138->110|138->110|138->110|139->111
                    -- GENERATED --
                */
            