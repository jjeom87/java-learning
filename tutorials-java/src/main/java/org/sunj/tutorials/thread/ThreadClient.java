package org.sunj.tutorials.thread;

public class ThreadClient {
  

  public static void main(String[] args) {
    System.out.println("Start main method.");

    for (int i = 0; i < 10; i++) {
      ThreadTest1 test = new ThreadTest1(i);
      test.start(); // 이 메소드를 실행하면 Thread 내의 run()을 수행한다.
    }
    System.out.println("current Index: "+ ThreadTest1.index); // index의 값을 반환합니다.
    System.out.println("End main method.");
  }
}
