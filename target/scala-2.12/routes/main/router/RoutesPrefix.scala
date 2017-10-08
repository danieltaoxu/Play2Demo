
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/tao/Projet/Play2Demo/conf/routes
// @DATE:Sun Sep 17 12:00:26 CEST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
