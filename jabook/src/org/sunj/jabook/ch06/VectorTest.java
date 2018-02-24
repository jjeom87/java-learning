package org.sunj.jabook.ch06;

import java.util.Vector;

public class VectorTest {
	public static void main(String[] args) {
		Vector v = new Vector();

		System.out.println("생성직후의 size: " + v.size());

		// 1. 벡터객체에 데이터4개 삽입 
		v.addElement(new String("망아지"));
		v.addElement(new String("송아지"));
		v.addElement(new String("강아지"));
		v.addElement(new String("병아리"));
		System.out.println("데이터 삽입후의 size: " + v.size());

		// 2. Vector의 요소 가져오기
		for (int i = 0; i < v.size(); i++) {
			String temp = (String) v.elementAt(i);
			System.out.println("벡터의 " + i + "번째:" + temp);
		}
	}

}