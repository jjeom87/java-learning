package org.sunj.tutorials.lambda;

public class LambdaExpressionExample1 {
  public static void main(String[] args) {
    // Thread - traditional
    new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println("Hello World.");
      }
    }).start();

    // Thread - Lambda Expression
    new Thread(() -> {
      System.out.println("Hello Lambda Expression.");
    }).start();
  }
}
