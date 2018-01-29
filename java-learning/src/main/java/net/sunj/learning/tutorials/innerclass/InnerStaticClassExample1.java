package net.sunj.learning.tutorials.innerclass;

public class InnerStaticClassExample1 {
  public class innerClass {
  }

  public static class staticInnerClass {
  }
}


class Test {
  public static void main(String[] args) {
    InnerStaticClassExample1.innerClass a = new InnerStaticClassExample1().new innerClass();
    InnerStaticClassExample1.staticInnerClass b = new InnerStaticClassExample1.staticInnerClass();
    System.out.println(a);
    System.out.println(b);
  }
}
