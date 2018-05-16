package org.sunj.designpatterns.factory.ex3.fm.client;

import org.sunj.designpatterns.factory.ex3.fm.framework.PizzaStore;
import org.sunj.designpatterns.factory.ex3.fm.framework.SimplePizzaFactory;

public class SimplePizzaStoreClient {

  public static void main(String[] args) {
    PizzaStore simplePizzaStore = new PizzaStore(new SimplePizzaFactory());
    simplePizzaStore.orderPizza("cheese");
  }

}
