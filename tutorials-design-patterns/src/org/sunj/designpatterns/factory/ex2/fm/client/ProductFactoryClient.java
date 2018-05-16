package org.sunj.designpatterns.factory.ex2.fm.client;

import org.sunj.designpatterns.factory.ex2.fm.framework.Product;
import org.sunj.designpatterns.factory.ex2.fm.framework.ProductFactory;

public class ProductFactoryClient {
  public static void main(String[] args) {
    Product t1 = ProductFactory.getProduct("ticket", "한국여행", 300000);
    Product c1 = ProductFactory.getProduct("computer", "pc", 1500000);

    System.out.println(t1.toString());
    System.out.println(c1.toString());
  }
}
