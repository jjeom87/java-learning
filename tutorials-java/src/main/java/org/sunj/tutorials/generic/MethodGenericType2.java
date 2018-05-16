package org.sunj.tutorials.generic;

public class MethodGenericType2 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Box<Integer> box1 = MethodGenericType2.<Integer> boxing(100);
    int intValue = box1.get();
    System.out.println("intValue : " + intValue);
    
 
    Box<String> box2 = MethodGenericType2.<String> boxing("ABC");
    String strValue = box2.get();
    System.out.println("strValue : " + strValue);
  }

  public static <T> Box<T> boxing(T t) {
    Box<T> box = new Box<T>();
    box.set(t);
    return box;
  }
  
}
