package org.sunj.ch02;

public class IntegerExam {

  public static void main(String[] args) {
    Integer i1 = 5;
    int max_int = Integer.MAX_VALUE;
    long i1_long = i1.longValue();
    int i1_size = Integer.SIZE;
    Class<Integer> type = Integer.TYPE;
    

    int i2 = 5;
    // int min_int = i2.MIN_VALUE;
    // long i2_long = i2.longValue();
    System.out.println("max_int: " + max_int);
    System.out.println("i1_long: " + i1_long);
    System.out.println("i1_size: " + i1_size);
    System.out.println("type: " + type);
    System.out.println("i2: " + i2);
  }

}
