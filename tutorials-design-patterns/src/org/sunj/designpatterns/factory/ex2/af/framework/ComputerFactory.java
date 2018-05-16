package org.sunj.designpatterns.factory.ex2.af.framework;

public class ComputerFactory implements ProductAbstractFactory {

  private String name;
  private int price;

  public ComputerFactory(String name, int price) {
    this.name = name;
    this.price = price;
  }

  public Product createProduct() {
    return new Computer(name, price);
  }
}
