package org.sunj.ch05;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutputStreamExam {

  public static void main(String[] args) {
    // try의 뒤에나오는 괄호()사이에서 만든 stream은 별도로 close하지 않아도 됩니다.
    // 이 아래에 out을 이용해서 data.txt에 int값 100, double값 3.14를 저장하세요.
    try (DataOutputStream out = new DataOutputStream(new FileOutputStream("data.txt"));) {
      out.writeInt(100);
      out.writeInt(200);
      out.writeInt(300);
      out.writeDouble(3.14);
    } catch (Exception e) {
    }
  }

}
