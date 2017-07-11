package controllers;

import play.*;
import play.mvc.*;
import play.data.*;
import views.html.*;
import models.*;

public class Products extends Controller {  

public Result create() {
  Form<Product> form = Form.form(Product.class);
	   return ok(views.html.product.form.render(form));
   }

   public Result postForm() {
	  Form<Product> productForm = Form.form(Product.class).bindFromRequest();
	  if (productForm.hasErrors()) {
	  return badRequest(views.html.product.form.render(productForm));
  } else {
 Product product = productForm.get();
	  product.save();

 flash("success", "Product saved!");
		  return redirect(controllers.routes.Products.create());
  }
   }
}
