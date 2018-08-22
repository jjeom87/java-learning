package org.sunj.ch05;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInputStreamExam {

  public static void main(String[] args) {
    try (DataInputStream in = new DataInputStream(new FileInputStream("data.txt"));) {
      int x = in.readInt();
      int y = in.readInt();
      int z = in.readInt();
    } catch (Exception e) {
    }
  }

}
