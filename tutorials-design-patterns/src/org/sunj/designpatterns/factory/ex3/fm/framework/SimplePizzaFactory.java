package org.sunj.designpatterns.factory.ex3.fm.framework;

public class SimplePizzaFactory {

  public Pizza createPizza(String type) {
    Pizza pizza = null;
    if (type.equals("cheese")) {
      pizza = new CheesePizza();
    } else if (type.equals("greek")) {
      pizza = new ClamPizza();
    } else {
      pizza = new PepperoniPizza();
    }
    return pizza;
  }
}
