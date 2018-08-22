package org.sunj.ch05;

import java.io.FileWriter;
import java.io.PrintWriter;

public class CharIOExam {

  public static void main(String[] args) {
    try (PrintWriter pw = new PrintWriter(new FileWriter("data.txt"));){
      pw.println("안녕하세요. PrintWriter입니다.");
      System.out.println("안녕하세요. PrintWriter입니다.");
      //pw.write("안녕하세요. PrintWriter입니다.");
    } catch (Exception e) {
      // TODO: handle exception
    }
    
  }

}
