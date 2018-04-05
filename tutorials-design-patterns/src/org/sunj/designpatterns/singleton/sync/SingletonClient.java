package org.sunj.designpatterns.singleton.sync;

public class SingletonClient {

  public static void main(String[] args) {
    Singleton singleton1 = Singleton.getInstance();
    Singleton singleton2 = Singleton.getInstance();
    System.out.println(singleton1);
    System.out.println(singleton2);
    System.out.println("안녕하세요");
  }

}
