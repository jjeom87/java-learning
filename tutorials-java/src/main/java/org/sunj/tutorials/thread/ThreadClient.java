package org.sunj.tutorials.thread;

public class ThreadClient {
  

  public static void main(String[] args) {
    System.out.println("Start main method.");

    for (int i = 0; i < 10; i++) {
      ThreadTest1 test = new ThreadTest1(i);
      test.start(); // �� �޼ҵ带 �����ϸ� Thread ���� run()�� �����Ѵ�.
    }
    System.out.println("current Index: "+ ThreadTest1.index); // index�� ���� ��ȯ�մϴ�.
    System.out.println("End main method.");
  }
}
