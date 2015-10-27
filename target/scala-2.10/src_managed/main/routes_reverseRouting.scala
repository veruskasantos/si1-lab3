// @SOURCE:C:/Users/Veruska/workspace/si1-lab3/conf/routes
// @HASH:717e096640adba4e91b9a42fc9169afac85469be
// @DATE:Tue Oct 27 00:29:53 BRST 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:11
// @LINE:9
// @LINE:6
package controllers {

// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:11
// @LINE:6
class ReverseApplication {
    

// @LINE:16
def redirecionaRemoveAnuncio(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "books/redirecionaRemoveAnuncio")
}
                                                

// @LINE:13
// @LINE:11
def anuncios(): Call = {
   () match {
// @LINE:11
case () if true => Call("GET", _prefix + { _defaultPrefix } + "index")
                                                        
// @LINE:13
case () if true => Call("GET", _prefix + { _defaultPrefix } + "books")
                                                        
   }
}
                                                

// @LINE:14
def novoAnuncio(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "books")
}
                                                

// @LINE:15
def removeAnuncio(anuncio:Long, codigo:String, satisfeito:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "books/removeAnuncio" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("anuncio", anuncio)), Some(implicitly[QueryStringBindable[String]].unbind("codigo", codigo)), Some(implicitly[QueryStringBindable[String]].unbind("satisfeito", satisfeito)))))
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:17
def retornaBusca(palavra:String, instrumentos:Long, estilosG:Long, interesse:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "books/retornaBusca" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("palavra", palavra)), Some(implicitly[QueryStringBindable[Long]].unbind("instrumentos", instrumentos)), Some(implicitly[QueryStringBindable[Long]].unbind("estilosG", estilosG)), Some(implicitly[QueryStringBindable[String]].unbind("interesse", interesse)))))
}
                                                
    
}
                          
}
                  


// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:11
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:11
// @LINE:6
class ReverseApplication {
    

// @LINE:16
def redirecionaRemoveAnuncio : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.redirecionaRemoveAnuncio",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "books/redirecionaRemoveAnuncio"})
      }
   """
)
                        

// @LINE:13
// @LINE:11
def anuncios : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.anuncios",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "index"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "books"})
      }
      }
   """
)
                        

// @LINE:14
def novoAnuncio : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.novoAnuncio",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "books"})
      }
   """
)
                        

// @LINE:15
def removeAnuncio : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.removeAnuncio",
   """
      function(anuncio,codigo,satisfeito) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "books/removeAnuncio" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("anuncio", anuncio), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("codigo", codigo), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("satisfeito", satisfeito)])})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:17
def retornaBusca : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.retornaBusca",
   """
      function(palavra,instrumentos,estilosG,interesse) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "books/retornaBusca" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("palavra", palavra), (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("instrumentos", instrumentos), (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("estilosG", estilosG), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("interesse", interesse)])})
      }
   """
)
                        
    
}
              
}
        


// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:11
// @LINE:9
// @LINE:6
package controllers.ref {


// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:11
// @LINE:6
class ReverseApplication {
    

// @LINE:16
def redirecionaRemoveAnuncio(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.redirecionaRemoveAnuncio(), HandlerDef(this, "controllers.Application", "redirecionaRemoveAnuncio", Seq(), "GET", """""", _prefix + """books/redirecionaRemoveAnuncio""")
)
                      

// @LINE:11
def anuncios(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.anuncios(), HandlerDef(this, "controllers.Application", "anuncios", Seq(), "GET", """""", _prefix + """index""")
)
                      

// @LINE:14
def novoAnuncio(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.novoAnuncio(), HandlerDef(this, "controllers.Application", "novoAnuncio", Seq(), "POST", """""", _prefix + """books""")
)
                      

// @LINE:15
def removeAnuncio(anuncio:Long, codigo:String, satisfeito:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.removeAnuncio(anuncio, codigo, satisfeito), HandlerDef(this, "controllers.Application", "removeAnuncio", Seq(classOf[Long], classOf[String], classOf[String]), "GET", """""", _prefix + """books/removeAnuncio""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:17
def retornaBusca(palavra:String, instrumentos:Long, estilosG:Long, interesse:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.retornaBusca(palavra, instrumentos, estilosG, interesse), HandlerDef(this, "controllers.Application", "retornaBusca", Seq(classOf[String], classOf[Long], classOf[Long], classOf[String]), "GET", """""", _prefix + """books/retornaBusca""")
)
                      
    
}
                          
}
        
    