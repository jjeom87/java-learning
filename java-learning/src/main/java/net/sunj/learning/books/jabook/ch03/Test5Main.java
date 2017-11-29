package net.sunj.learning.books.jabook.ch03;

public class Test5Main {

	public static void main(String[] args) {
		int s;
		Test5 t5 = new Test5();
		t5.setMyTop(1000);
		s = t5.getTop();
		System.out.println(s);
		System.out.println(t5.getTop());
	}

}