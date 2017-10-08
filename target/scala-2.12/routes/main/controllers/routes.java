
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/tao/Projet/Play2Demo/conf/routes
// @DATE:Sun Sep 17 12:00:26 CEST 2017

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseProducts Products = new controllers.ReverseProducts(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseBarcode Barcode = new controllers.ReverseBarcode(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseApplication Application = new controllers.ReverseApplication(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseProducts Products = new controllers.javascript.ReverseProducts(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseBarcode Barcode = new controllers.javascript.ReverseBarcode(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseApplication Application = new controllers.javascript.ReverseApplication(RoutesPrefix.byNamePrefix());
  }

}
