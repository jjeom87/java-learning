package org.sunj.tutorials.generic.ex3;

public class BoundedTypeParameterExam {

  public static void main(String[] args) {
    int result1 = Util.compare(10, 20);
    System.out.println(result1);

    int result2 = Util.compare(4.5, 3);
    System.out.println(result2);
  }

}
