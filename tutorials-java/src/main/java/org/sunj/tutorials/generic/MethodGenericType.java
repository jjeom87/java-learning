package org.sunj.tutorials.generic;

public class MethodGenericType {
  public static <T> int methodGeneric(T[] list, T item) {
    int count = 0;
    for (T t : list) {
      if (item == t) {
        count++;
      }
    }
    return count;
  }

  public static <T> T method1(T t) {
    return t;
  }
  
  
  public static void main(String[] args) {
    String[] str = {"Google", "Yahoo", "Google", "Yahoo", "Yahoo", "Yahoo"};
    int i = methodGeneric(str, "Google");
    System.out.println(i);

    String a = method1("a");

  }
}
