package models;
import com.avaje.ebean.*;
import play.data.validation.Constraints;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Products")
public class Product extends Model {
  
@Id
public Long id;

@Column
@Constraints.Required
public String name;

public static Finder<Long, Product> find = new Finder<Long, Product>(
  Long.class, Product.class
);

public Long getId() {
  return id;
}
public void setId(Long id) {
  this.id = id;
}
public String getName() {
  return name;
}
public void setName(String name) {
  this.name = name;
}


  public String validate() {
    if (name.length() < 3 || name.length() > 100) {
      return "Name must be at least 3 characters or a maximum of 100 characters";
    }
    return null;
  }

}

