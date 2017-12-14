package net.sunj.learning.tutorials.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class UsingFixedThreadPool {
  public static void main(String argc[]) {
    System.out.println("Main thread starts here...");

    ExecutorService execService = Executors.newFixedThreadPool(1);

    execService.execute(new MyThreadTask());
    execService.execute(new MyThreadTask());

    execService.shutdown();

    System.out.println("Main thread ends here...");
  }
}


class MyThreadTask implements Runnable {
  private static int count = 0;
  private int id;

  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      if (id == 1) {
        try {
          TimeUnit.MINUTES.sleep(10);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }

      System.out.println("<" + id + ">TICK TICK " + i);
      try {
        TimeUnit.MICROSECONDS.sleep((long) Math.random() * 1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  public MyThreadTask() {
    this.id = ++count;
  }
}
