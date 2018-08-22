package org.sunj.ch03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam {

  public static void main(String[] args) {
    Set<String> set = new HashSet<String>();
    set.add("a");
    set.add("a");
    set.add("b");

    System.out.println("set의 내용을 출력합니다.");
    for (String str : set) {
      System.out.println(str);
    }

    Iterator<String> iter = set.iterator();
    // iter를 이용해서 set의 내용을 출력하세요.
    while (iter.hasNext()) {
      String str = (String) iter.next();
      System.out.println(str);
    }
  }
}
