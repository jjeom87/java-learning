package org.sunj.designpatterns.factory.ex3.fm.framework;

public class PizzaStore {
  SimplePizzaFactory simplePizzaFactory;

  public PizzaStore(SimplePizzaFactory simplePizzaFactory) {
    this.simplePizzaFactory = simplePizzaFactory;
  }

  public Pizza orderPizza(String type) {
    Pizza pizza;
    /*
     * if (type.equals("cheese")) { pizza = new CheesePizza(); } else if (type.equals("greek")) {
     * pizza = new ClamPizza(); } else { pizza = new PepperoniPizza(); }
     */

    pizza = simplePizzaFactory.createPizza(type);

    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    return pizza;
  }
}
