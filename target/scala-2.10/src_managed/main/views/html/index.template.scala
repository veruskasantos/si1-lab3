
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
            
            <input type="submit" class="btn btn-primary" value="Criar">
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
                    DATE: Mon Nov 02 22:11:45 BRST 2015
                    SOURCE: C:/Users/Veruska/workspace/si1-lab3/app/views/index.scala.html
                    HASH: fe3119b73ac1c27ac667b46f0eb717b3379f5593
                    MATRIX: 813->1|984->78|1537->595|1552->601|1605->632|1837->828|1852->834|1900->860|4018->2942|4058->2966|4098->2968|4173->3007|4192->3017|4222->3025|4261->3028|4280->3038|4312->3048|4373->3077|4646->3314|4680->3332|4720->3334|4795->3373|4807->3376|4837->3384|4876->3387|4888->3390|4920->3400|4981->3429|5262->3674|5296->3692|5336->3694|5411->3733|5423->3736|5453->3744|5492->3747|5504->3750|5536->3760|5597->3789
                    LINES: 26->1|29->1|40->12|40->12|40->12|52->24|52->24|52->24|82->54|82->54|82->54|83->55|83->55|83->55|83->55|83->55|83->55|84->56|89->61|89->61|89->61|90->62|90->62|90->62|90->62|90->62|90->62|91->63|96->68|96->68|96->68|97->69|97->69|97->69|97->69|97->69|97->69|98->70
                    -- GENERATED --
                */
            