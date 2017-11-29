package net.sunj.learning.books.jabook.ch03;

public class Test6Main {

	public static void main(String[] args) {
		Test6 t6 = new Test6();
		t6.setValue(3, 5);
		int s = t6.getValue();
		System.out.println("두수의 합과 곱을 다시 더한값은:" + s);
	}

}
