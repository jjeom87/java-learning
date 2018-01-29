package net.sunj.learning.tutorials.lambda;

public class FunctionalInterfaceExample1 {

  public static void main(String[] args) {
    Func add = (int a, int b) -> a + b;
    Func sub = (int a, int b) -> a - b;
    Func add2 = (int a, int b) -> {
      return a + b;
    };

    int result = add.calc(1, 2) + add2.calc(3, 4); // 10
    System.out.println("result : " + result);
    System.out.println(sub.calc(5, 6));
  }

  @FunctionalInterface // 인터페이스 선언시 컴파일러 수준에서 오류 확인 가능.
  private interface Func {
    public int calc(int a, int b);
  }

}
