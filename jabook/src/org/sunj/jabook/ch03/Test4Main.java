package org.sunj.jabook.ch03;

public class Test4Main {

	public static void main(String[] args) {
		int s;
		Test4 t4 = new Test4();
		t4.a = 100;
		t4.b = 200;
		s = t4.sum(3, 5);
		System.out.println("a는:" + t4.a);
		System.out.println("b는:" + t4.b);
		System.out.println("결과는:" + t4.sum(3, 5));
		System.out.println("결과는:" + s);
	}

}