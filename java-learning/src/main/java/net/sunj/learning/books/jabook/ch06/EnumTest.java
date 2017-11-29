package net.sunj.learning.books.jabook.ch06;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;

public class EnumTest {

	public static void main(String[] args) {
		Vector v = new Vector();

		//1. 벡터객체에 데이터4개 삽입 
		v.addElement(new String("망아지"));
		v.addElement(new String("송아지"));
		v.addElement(new String("강아지"));
		v.addElement(new String("병아리"));

		Hashtable h = new Hashtable();

		//1. 해시테이블에 객체의 삽입 
		h.put("1", new String("홍길동"));
		h.put("2", new String("안녕하세요"));
		h.put("3", new String("02-1111-2222"));
		h.put("4", new String("017-777-9999"));

		Enumeration ev = v.elements();
		while (ev.hasMoreElements()) {
			String temp = (String) ev.nextElement();
			System.out.println("벡터의 Enumeration:" + temp);
		}

		System.out.println();

		Enumeration ei = h.elements();
		while (ei.hasMoreElements()) {
			String temp = (String) ei.nextElement();
			System.out.println("해시의 Enumeration:" + temp);
		}

		System.out.println();
		Iterator ih = h.values().iterator();

		while (ih.hasNext()) {
			String temp = (String) ih.next();
			System.out.println("해시의 Iterator:" + temp);
		}
	}
}