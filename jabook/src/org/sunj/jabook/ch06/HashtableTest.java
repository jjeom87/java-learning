package org.sunj.jabook.ch06;

import java.util.Hashtable;

public class HashtableTest {
	public static void main(String[] args) {
		Hashtable h = new Hashtable();

		//1. 해시테이블에 객체의 삽입 
		h.put("Name", new String("홍길동"));
		h.put("Age", new Integer(27));
		h.put("Tel", new String("02-1111-2222"));
		h.put("Handphone", new String("017-777-9999"));
		h.put("Etc", new String("I'm a boy"));

		//키값을 이용하여 객체 추출
		String name = (String) h.get("Name");
		if (name != null) {
			System.out.println("Name = " + name);
		}

		Integer age = (Integer) h.get("Age");
		if (age != null) {
			System.out.println("Age = " + age.intValue());
		}
	}
}