
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/tao/Projet/Play2Demo/conf/routes
// @DATE:Sun Sep 17 12:00:26 CEST 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers {

  // @LINE:22
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def versioned(file:Asset): Call = {
      implicit val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:8
  class ReverseProducts(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def show(esn:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "products/" + implicitly[play.api.mvc.PathBindable[Long]].unbind("esn", esn))
    }
  
    // @LINE:13
    def justJson(s:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "products/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("s", s)))
    }
  
    // @LINE:8
    def list(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "products")
    }
  
    // @LINE:10
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "products")
    }
  
    // @LINE:9
    def newProduct(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "products/createProduct")
    }
  
  }

  // @LINE:12
  class ReverseBarcode(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def barcode(esn:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "barcode/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("esn", esn)))
    }
  
  }

  // @LINE:7
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }


}
