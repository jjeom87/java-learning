package org.sunj.designpatterns.factory.ex2.af.client;

import org.sunj.designpatterns.factory.ex2.af.framework.ComputerFactory;
import org.sunj.designpatterns.factory.ex2.af.framework.Product;
import org.sunj.designpatterns.factory.ex2.af.framework.ProductFactory;
import org.sunj.designpatterns.factory.ex2.af.framework.TicketFactory;

public class AbstractFactoryClient {

  public static void main(String[] args) {
    Product com = ProductFactory.getProduct(new ComputerFactory("com1", 2000));
    Product tk = ProductFactory.getProduct(new TicketFactory("공연", 100000));
    System.out.println(com.toString());
    System.out.println(tk.toString());
  }

}
