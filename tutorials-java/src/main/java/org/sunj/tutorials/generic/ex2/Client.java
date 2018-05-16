package org.sunj.tutorials.generic.ex2;

public class Client {

  public static void main(String[] args) throws InstantiationException, IllegalAccessException {
    AbstractBox<ResponseBox> box = new BlackBox();
    ResponseBox res = box.getBox();
  }
}
