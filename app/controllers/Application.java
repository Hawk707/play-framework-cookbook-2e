package controllers;

import play.mvc.*;

import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class Application extends Controller {

public Result hello(){
      return ok("Hello World");
    }
	
public Result echo(String msg) {
      return ok("Echoing "+msg);
    }
}