package org.sunj.tutorials.thread;

import java.util.Random;

public class ThreadTest1 extends Thread {
  // index 변수를 추가해서 스레드가 동작시에 해당 변수를 증가시키도록 할겁니다.
  public static int index = 0;

  private int id = -1;

  public ThreadTest1(int id) {
    this.id = id;
  }

  public void run() {
    System.out.println(id + "번 쓰레드 동작 중...");
    Random r = new Random(System.currentTimeMillis());
    try {
      long s = r.nextInt(3000); // 3초내로 끝내자.
      Thread.sleep(s); // 쓰레드를 잠시 멈춤
      index++; // index 변수를 증가시킵니다.
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println(id + "번 쓰레드 동작 종료...");
  }
}
