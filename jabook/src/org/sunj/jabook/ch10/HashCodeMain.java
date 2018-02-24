package org.sunj.jabook.ch10;

import java.util.Date;

public class HashCodeMain {

	public static void main(String[] args) {
		System.out.println("new Date() : " + new Date().hashCode());
		System.out.println("new Object() : " + new Object().hashCode());
		System.out.println("new String() : " + new String("김삿갓").hashCode());
		System.out.println("new Date() : " + new Date().hashCode());
		System.out.println("new Object() : " + new Object().hashCode());
		System.out.println("new String() : " + new String("홍길동").hashCode());
	}
}