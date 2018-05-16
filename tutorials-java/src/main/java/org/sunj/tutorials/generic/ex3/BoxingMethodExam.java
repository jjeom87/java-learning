package org.sunj.tutorials.generic.ex3;

public class BoxingMethodExam {

  public static void main(String[] args) {
    Box<Integer> box1 = Util.<Integer>boxing(100); // 제네릭 매개변수 타입 명시
    int intValue = box1.get();
    System.out.println(intValue);

    Box<String> box2 = Util.boxing("ABC"); // 제네릭 매개변수 타입 추론.
    String strValue = box2.get();
    System.out.println(strValue);
  }

}
