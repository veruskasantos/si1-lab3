// @SOURCE:C:/Users/Veruska/workspace/si1-lab3/conf/routes
// @HASH:717e096640adba4e91b9a42fc9169afac85469be
// @DATE:Wed Oct 28 23:58:35 BRST 2015


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:9
private[this] lazy val controllers_Assets_at1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        

// @LINE:11
private[this] lazy val controllers_Application_anuncios2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("index"))))
        

// @LINE:13
private[this] lazy val controllers_Application_anuncios3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("books"))))
        

// @LINE:14
private[this] lazy val controllers_Application_novoAnuncio4 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("books"))))
        

// @LINE:15
private[this] lazy val controllers_Application_removeAnuncio5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("books/removeAnuncio"))))
        

// @LINE:16
private[this] lazy val controllers_Application_redirecionaRemoveAnuncio6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("books/redirecionaRemoveAnuncio"))))
        

// @LINE:17
private[this] lazy val controllers_Application_retornaBusca7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("books/retornaBusca"))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """index""","""controllers.Application.anuncios()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """books""","""controllers.Application.anuncios()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """books""","""controllers.Application.novoAnuncio()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """books/removeAnuncio""","""controllers.Application.removeAnuncio(anuncio:Long, codigo:String, satisfeito:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """books/redirecionaRemoveAnuncio""","""controllers.Application.redirecionaRemoveAnuncio()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """books/retornaBusca""","""controllers.Application.retornaBusca(palavra:String, instrumentos:Long, estilosG:Long, interesse:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:9
case controllers_Assets_at1(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        

// @LINE:11
case controllers_Application_anuncios2(params) => {
   call { 
        invokeHandler(controllers.Application.anuncios(), HandlerDef(this, "controllers.Application", "anuncios", Nil,"GET", """""", Routes.prefix + """index"""))
   }
}
        

// @LINE:13
case controllers_Application_anuncios3(params) => {
   call { 
        invokeHandler(controllers.Application.anuncios(), HandlerDef(this, "controllers.Application", "anuncios", Nil,"GET", """""", Routes.prefix + """books"""))
   }
}
        

// @LINE:14
case controllers_Application_novoAnuncio4(params) => {
   call { 
        invokeHandler(controllers.Application.novoAnuncio(), HandlerDef(this, "controllers.Application", "novoAnuncio", Nil,"POST", """""", Routes.prefix + """books"""))
   }
}
        

// @LINE:15
case controllers_Application_removeAnuncio5(params) => {
   call(params.fromQuery[Long]("anuncio", None), params.fromQuery[String]("codigo", None), params.fromQuery[String]("satisfeito", None)) { (anuncio, codigo, satisfeito) =>
        invokeHandler(controllers.Application.removeAnuncio(anuncio, codigo, satisfeito), HandlerDef(this, "controllers.Application", "removeAnuncio", Seq(classOf[Long], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """books/removeAnuncio"""))
   }
}
        

// @LINE:16
case controllers_Application_redirecionaRemoveAnuncio6(params) => {
   call { 
        invokeHandler(controllers.Application.redirecionaRemoveAnuncio(), HandlerDef(this, "controllers.Application", "redirecionaRemoveAnuncio", Nil,"GET", """""", Routes.prefix + """books/redirecionaRemoveAnuncio"""))
   }
}
        

// @LINE:17
case controllers_Application_retornaBusca7(params) => {
   call(params.fromQuery[String]("palavra", None), params.fromQuery[Long]("instrumentos", None), params.fromQuery[Long]("estilosG", None), params.fromQuery[String]("interesse", None)) { (palavra, instrumentos, estilosG, interesse) =>
        invokeHandler(controllers.Application.retornaBusca(palavra, instrumentos, estilosG, interesse), HandlerDef(this, "controllers.Application", "retornaBusca", Seq(classOf[String], classOf[Long], classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """books/retornaBusca"""))
   }
}
        
}

}
     