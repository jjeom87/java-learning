package org.sunj.designpatterns.factory.ex2.af.framework;

public class ProductFactory {
  public static Product getProduct(ProductAbstractFactory product) {
    return product.createProduct();
  }
}
