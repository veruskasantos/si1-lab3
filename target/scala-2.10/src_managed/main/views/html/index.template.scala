
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[List[Instrumento],List[Estilo],List[EstiloNO],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(instr : List[Instrumento], estilo : List[Estilo], estiloNG : List[EstiloNO]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.79*/("""

<html lang="">
    <head>
        <title>Hibernate Example</title>
        <meta charset="UTF-8">
        <meta name=description content="">
        <meta name=viewport content="width=device-width, initial-scale=1">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!-- Bootstrap CSS -->
        <link href="http://netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css" rel="stylesheet" media="screen">
    	<link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*12.56*/routes/*12.62*/.Assets.at("images/violao.jpg"))),format.raw/*12.93*/("""">
    </head>
    <body>
    <div class="content">
    
    
    <section id="cadastro">
    	

		<div class="col-sm-4">
        <h2>Cria um novo Anúncio</h2>

        <form action=""""),_display_(Seq[Any](/*24.24*/routes/*24.30*/.Application.novoAnuncio())),format.raw/*24.56*/("""" method="post"> 
        	<label for="codigo"> Código </label>
        	<input type="text" name="codigo" id="inputCodigo" placeholder="Código de segurança" class="form-control" required="required">
        
            <label for="titulo"> Título: </label>
            <input type="text" name="titulo" id="inputNome" placeholder="Título do seu anúncio" class="form-control"required="required">
            
            <label for="descricao"> Descrição: </label>
            <input type="text" name="descricao" id="inputDescricao" placeholder="Descreva o que você quer anunciar" class="form-control" required="required">
            
            <label for="cidade"> Cidade: </label>
            <input type="text" name="cidade" id="inputCidade" placeholder="Cidade onde mora" class="form-control" required="required">
            
            <label for="bairro"> Bairro: </label>
            <input type="text" name="bairro" id="inputBairro" placeholder="Bairro onde mora" class="form-control" required="required">
            
            <label for="email"> E-mail: </label>
            <input type="text" name="email" id="inputEmail" placeholder="Seu email" class="form-control" required="required">
            
            <label for="facebook"> Facebook: </label>
            <input type="text" name="facebook" id="inputFace" placeholder="Seu link do facebook" class="form-control" required="required">
            
            <label for="banda"> Deseja formar banda? </label>
            <input type="text" name="banda" id="inputBanda" placeholder="Sim ou Não" class="form-control" required="required">
            
            <label for="tocar"> Deseja tocar ocasionalmente? </label>
            <input type="text" name="tocar" id="inputTocar" placeholder="Sim ou Não" class="form-control" required="required">
            
            <label for="instrumentos"> Instrumento: </label>
            <select name="instrumentos" id="inputAutores" class="form-control multiselect" multiple="multiple" required="required">
                     """),_display_(Seq[Any](/*54.23*/for(instrument <- instr) yield /*54.47*/ {_display_(Seq[Any](format.raw/*54.49*/("""
                     <option value=""""),_display_(Seq[Any](/*55.38*/instrument/*55.48*/.getId())),format.raw/*55.56*/("""">"""),_display_(Seq[Any](/*55.59*/instrument/*55.69*/.getNome())),format.raw/*55.79*/("""</option>
               		""")))})),format.raw/*56.19*/("""
             </select>
             
             <label for="estilosG"> Estilo que gosta: </label>
            <select name="estilosG" id="inputEstilosG" class="form-control multiselect" multiple="multiple">
                     """),_display_(Seq[Any](/*61.23*/for(est <- estilo) yield /*61.41*/ {_display_(Seq[Any](format.raw/*61.43*/("""
                     <option value=""""),_display_(Seq[Any](/*62.38*/est/*62.41*/.getId())),format.raw/*62.49*/("""">"""),_display_(Seq[Any](/*62.52*/est/*62.55*/.getNome())),format.raw/*62.65*/("""</option>
               		""")))})),format.raw/*63.19*/("""
             </select>
             
              <label for="estilosNG"> Estilo que não gosta: </label>
            <select name="estilosNG" id="inputEstilosNG" class="form-control multiselect" multiple="multiple">
                     """),_display_(Seq[Any](/*68.23*/for(est <- estilo) yield /*68.41*/ {_display_(Seq[Any](format.raw/*68.43*/("""
                     <option value=""""),_display_(Seq[Any](/*69.38*/est/*69.41*/.getId())),format.raw/*69.49*/("""">"""),_display_(Seq[Any](/*69.52*/est/*69.55*/.getNome())),format.raw/*69.65*/("""</option>
               		""")))})),format.raw/*70.19*/("""
             </select>
            
            <input type="submit" class="btn btn-primary" value="Create">
        </form>

        </div>
        </section>
    </div>

        <!-- jQuery -->
        <script src="http://code.jquery.com/jquery.js"></script>
        <!-- Bootstrap JavaScript -->
        <script src="http://netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
    </body>
</html>

    """))}
    }
    
    def render(instr:List[Instrumento],estilo:List[Estilo],estiloNG:List[EstiloNO]): play.api.templates.HtmlFormat.Appendable = apply(instr,estilo,estiloNG)
    
    def f:((List[Instrumento],List[Estilo],List[EstiloNO]) => play.api.templates.HtmlFormat.Appendable) = (instr,estilo,estiloNG) => apply(instr,estilo,estiloNG)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Jun 05 18:37:56 BRT 2015
                    SOURCE: C:/Users/Veruska/si1-lab2/app/views/index.scala.html
                    HASH: 4b999d1103bba0602e97c7b12cd0fc37961276df
                    MATRIX: 813->1|984->78|1526->584|1541->590|1594->621|1814->805|1829->811|1877->837|3965->2889|4005->2913|4045->2915|4119->2953|4138->2963|4168->2971|4207->2974|4226->2984|4258->2994|4318->3022|4586->3254|4620->3272|4660->3274|4734->3312|4746->3315|4776->3323|4815->3326|4827->3329|4859->3339|4919->3367|5195->3607|5229->3625|5269->3627|5343->3665|5355->3668|5385->3676|5424->3679|5436->3682|5468->3692|5528->3720
                    LINES: 26->1|29->1|40->12|40->12|40->12|52->24|52->24|52->24|82->54|82->54|82->54|83->55|83->55|83->55|83->55|83->55|83->55|84->56|89->61|89->61|89->61|90->62|90->62|90->62|90->62|90->62|90->62|91->63|96->68|96->68|96->68|97->69|97->69|97->69|97->69|97->69|97->69|98->70
                    -- GENERATED --
                */
            