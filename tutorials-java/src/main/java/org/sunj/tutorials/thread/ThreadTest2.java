package org.sunj.tutorials.thread;

import java.util.Random;

public class ThreadTest2 implements Runnable {
  // index ������ �߰��ؼ� �����尡 ���۽ÿ� �ش� ������ ������Ű���� �Ұ̴ϴ�.
  private static int index = 0;

  private int id = -1;

  public ThreadTest2(int id) {
    this.id = id;
  }

  public void run() {
    System.out.println(id + "�� ������ ���� ��...");
    Random r = new Random(System.currentTimeMillis());
    try {
      long s = r.nextInt(3000); // 3�ʳ��� ������.
      Thread.sleep(s); // �����带 ��� ����
      index++; // index ������ ������ŵ�ϴ�.
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println(id + "�� ������ ���� ����...");
  }
}
