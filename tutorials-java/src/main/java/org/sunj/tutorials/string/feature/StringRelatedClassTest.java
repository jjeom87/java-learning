package org.sunj.tutorials.string.feature;

import org.junit.Test;

public class StringRelatedClassTest {

  @Test
  public void stringHashTest() {
    String stringValue1 = "TEST 1";
    String stringValue2 = "TEST 2";

    System.out.println("stringValue1: " + stringValue1.hashCode());
    System.out.println("stringValue2: " + stringValue2.hashCode());

    stringValue1 = stringValue1 + stringValue2;
    System.out.println("stringValue1: " + stringValue1.hashCode());

    StringBuffer sb = new StringBuffer();

    System.out.println("sb: " + sb.hashCode());

    sb.append("TEST StringBuffer");
    System.out.println("sb: " + sb.hashCode());
  }

  @Test
  public void test() {
    StringBuffer stringBuffer = new StringBuffer();
    StringBuilder stringBuilder = new StringBuilder();
    StringBuffer stringBuffer2 = new StringBuffer();

    for (int i = 0; i < 19; i++) {
      stringBuffer.append(i);
      stringBuilder.append(i);
    }

    System.out.println("StringBuffer.length : " + stringBuffer.length());
    System.out.println("stringBuffer.toString : " + stringBuffer.toString());

    stringBuffer2.append(1);
    stringBuffer2.append(2);
    stringBuffer2.append(3);

    System.out.println("stringBuffer2.length : " + stringBuffer2.length());
    System.out.println("stringBuffer2.toString : " + stringBuffer2.toString());
  }

  @Test
  public void compareStringBuilderAndBuffer() {
    StringBuffer stringBuffer = new StringBuffer();
    StringBuilder stringBuilder = new StringBuilder();

    new Thread(() -> {
      for (int i = 0; i < 10000; i++) {
        stringBuffer.append(i);
        stringBuilder.append(i);
      }
    }).start();

    new Thread(() -> {
      for (int i = 0; i < 10000; i++) {
        stringBuffer.append(i);
        stringBuilder.append(i);
      }
    }).start();

    new Thread(() -> {
      try {
        Thread.sleep(1000);

        System.out.println(stringBuffer.toString());
        System.out.println(stringBuilder.toString());
        System.out.println("StringBuffer.length : " + stringBuffer.length());
        System.out.println("StringBuilder.length : " + stringBuilder.length());
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }).start();

    try {
      Thread.sleep(6000);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

}
