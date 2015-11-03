
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
        
        <link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*13.55*/routes/*13.61*/.Assets.at("stylesheets/main.css"))),format.raw/*13.95*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*14.59*/routes/*14.65*/.Assets.at("images/violao.jpg"))),format.raw/*14.96*/("""">
        <script src=""""),_display_(Seq[Any](/*15.23*/routes/*15.29*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*15.74*/("""" type="text/javascript"></script>
        
        <h1> Bem vindo ao Club Music</h1>
        <!-- Bootstrap CSS -->
        <link href="http://netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css" rel="stylesheet" media="screen">
   </head>
   
   <body>
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
                    """),_display_(Seq[Any](/*50.22*/for(anuncio <- anuncios) yield /*50.46*/ {_display_(Seq[Any](format.raw/*50.48*/("""
                        <tr>
                        	<td>"""),_display_(Seq[Any](/*52.31*/anuncio/*52.38*/.getDataFormatada())),format.raw/*52.57*/("""</td>
                            <td>"""),_display_(Seq[Any](/*53.34*/anuncio/*53.41*/.getTitulo())),format.raw/*53.53*/("""</td>
                            <td>"""),_display_(Seq[Any](/*54.34*/anuncio/*54.41*/.getDescricao())),format.raw/*54.56*/("""</td>
                            <td>"""),_display_(Seq[Any](/*55.34*/anuncio/*55.41*/.getCidade())),format.raw/*55.53*/("""</td>
                            <td>"""),_display_(Seq[Any](/*56.34*/anuncio/*56.41*/.getBairro())),format.raw/*56.53*/("""</td>
                            <td>"""),_display_(Seq[Any](/*57.34*/anuncio/*57.41*/.getEmail())),format.raw/*57.52*/("""</td>
                            <td>"""),_display_(Seq[Any](/*58.34*/anuncio/*58.41*/.getFacebook())),format.raw/*58.55*/("""</td>
                            <td>"""),_display_(Seq[Any](/*59.34*/anuncio/*59.41*/.getBanda())),format.raw/*59.52*/("""</td>
                            <td>"""),_display_(Seq[Any](/*60.34*/anuncio/*60.41*/.getTocar())),format.raw/*60.52*/("""</td>
                            <td> 
                                """),_display_(Seq[Any](/*62.34*/for(instrument <- anuncio.getInstrumentos()) yield /*62.78*/ {_display_(Seq[Any](format.raw/*62.80*/("""
                                    <p> """),_display_(Seq[Any](/*63.42*/instrument/*63.52*/.getNome())),format.raw/*63.62*/("""</p>
                                """)))})),format.raw/*64.34*/("""
                            </td>
                            <td>
                            	"""),_display_(Seq[Any](/*67.31*/for(estiloG <- anuncio.getEstilosGosta()) yield /*67.72*/ {_display_(Seq[Any](format.raw/*67.74*/("""
                                    <p> """),_display_(Seq[Any](/*68.42*/estiloG/*68.49*/.getNome())),format.raw/*68.59*/("""</p>
                            """)))})),format.raw/*69.30*/("""
                            </td>
                            <td>
                            	"""),_display_(Seq[Any](/*72.31*/for(estiloNG <- anuncio.getEstilosNaoGosta()) yield /*72.76*/ {_display_(Seq[Any](format.raw/*72.78*/("""
                                    <p> """),_display_(Seq[Any](/*73.42*/estiloNG/*73.50*/.getNome())),format.raw/*73.60*/("""</p>
                            """)))})),format.raw/*74.30*/("""
                            </td>
                        </tr>
                    """)))})),format.raw/*77.22*/("""
                    </tbody>
                </table>
            </div>
            
            <h3 class="text-center">"""),_display_(Seq[Any](/*82.38*/contador)),format.raw/*82.46*/(""" anúncio(s) já ajudaram as pessoas</h3>
            
    <div class="col-sm-3" align="center">
    <form action=""""),_display_(Seq[Any](/*85.20*/routes/*85.26*/.Application.anuncios())),format.raw/*85.49*/("""">
    <input type="submit" class="btn btn-primary" value="Criar Novo Anúncio">
    </form>
    </div>
    
    <div class="col-sm-3" align="center">
    <form action=""""),_display_(Seq[Any](/*91.20*/routes/*91.26*/.Application.redirecionaRemoveAnuncio())),format.raw/*91.65*/("""">
    <input type="submit" class="btn btn-primary" value="Excluir Anúncio">
    </form>
    </div>
    
    <div class="col-sm-3" align="center">
    <form action=""""),_display_(Seq[Any](/*97.20*/routes/*97.26*/.Application.redirecionaComentarios())),format.raw/*97.63*/("""">
    <input type="submit" class="btn btn-primary" value="Comentários">
    </form>
    </div>
    <!-- a href="comentarios.scala.html">Ir para os comentários</a-->
    </div>
        
        <div class="col-sm-3" align="center">
        <br><br><br><br>
        <form action="/books/retornaBusca" method="get">
        <label for="palavra"> Palavra-chave:</label>
        <input type="input" name="palavra" class="form-control" required="required">
        
        <label for="instrumentos">Instrumento:</label>
        <select name="instrumentos" id="inputInstrumento" class="form-control multiselect" required="required">
                     """),_display_(Seq[Any](/*112.23*/for(inst <- instr) yield /*112.41*/ {_display_(Seq[Any](format.raw/*112.43*/("""
                     <option value=""""),_display_(Seq[Any](/*113.38*/inst/*113.42*/.getId())),format.raw/*113.50*/("""">"""),_display_(Seq[Any](/*113.53*/inst/*113.57*/.getNome())),format.raw/*113.67*/("""</option>
               		""")))})),format.raw/*114.19*/("""    
       </select>
             
        <label for="estilosG">Estilo:</label>
        <select name="estilosG" id="inputEstilo" class="form-control multiselect" required="required">
                     """),_display_(Seq[Any](/*119.23*/for(estilo <- estilo) yield /*119.44*/ {_display_(Seq[Any](format.raw/*119.46*/("""
                     <option value=""""),_display_(Seq[Any](/*120.38*/estilo/*120.44*/.getId())),format.raw/*120.52*/("""">"""),_display_(Seq[Any](/*120.55*/estilo/*120.61*/.getNome())),format.raw/*120.71*/("""</option>
               		""")))})),format.raw/*121.19*/("""
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
                    DATE: Mon Nov 02 23:57:23 BRST 2015
                    SOURCE: C:/Users/Veruska/workspace/si1-lab3/app/views/novo.scala.html
                    HASH: d3879e4fac90d47944e7a67b8c6751c44bd0a9d4
                    MATRIX: 831->1|1045->120|1480->519|1495->525|1551->559|1649->621|1664->627|1717->658|1779->684|1794->690|1861->735|3311->2149|3351->2173|3391->2175|3489->2237|3505->2244|3546->2263|3622->2303|3638->2310|3672->2322|3748->2362|3764->2369|3801->2384|3877->2424|3893->2431|3927->2443|4003->2483|4019->2490|4053->2502|4129->2542|4145->2549|4178->2560|4254->2600|4270->2607|4306->2621|4382->2661|4398->2668|4431->2679|4507->2719|4523->2726|4556->2737|4667->2812|4727->2856|4767->2858|4846->2901|4865->2911|4897->2921|4968->2960|5105->3061|5162->3102|5202->3104|5281->3147|5297->3154|5329->3164|5396->3199|5533->3300|5594->3345|5634->3347|5713->3390|5730->3398|5762->3408|5829->3443|5950->3532|6115->3661|6145->3669|6298->3786|6313->3792|6358->3815|6569->3990|6584->3996|6645->4035|6853->4207|6868->4213|6927->4250|7629->4915|7664->4933|7705->4935|7781->4974|7795->4978|7826->4986|7866->4989|7880->4993|7913->5003|7975->5032|8224->5244|8262->5265|8303->5267|8379->5306|8395->5312|8426->5320|8466->5323|8482->5329|8515->5339|8577->5368
                    LINES: 26->1|29->1|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|78->50|78->50|78->50|80->52|80->52|80->52|81->53|81->53|81->53|82->54|82->54|82->54|83->55|83->55|83->55|84->56|84->56|84->56|85->57|85->57|85->57|86->58|86->58|86->58|87->59|87->59|87->59|88->60|88->60|88->60|90->62|90->62|90->62|91->63|91->63|91->63|92->64|95->67|95->67|95->67|96->68|96->68|96->68|97->69|100->72|100->72|100->72|101->73|101->73|101->73|102->74|105->77|110->82|110->82|113->85|113->85|113->85|119->91|119->91|119->91|125->97|125->97|125->97|140->112|140->112|140->112|141->113|141->113|141->113|141->113|141->113|141->113|142->114|147->119|147->119|147->119|148->120|148->120|148->120|148->120|148->120|148->120|149->121
                    -- GENERATED --
                */
            