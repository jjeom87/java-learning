package org.sunj.designpatterns.factory.ex2.fm.framework;

public abstract class Product {
  public abstract String getName();

  public abstract int getPrice();

  @Override
  public String toString() {
    return "product name : " + getName() + ", price :" + getPrice();
  }
}
