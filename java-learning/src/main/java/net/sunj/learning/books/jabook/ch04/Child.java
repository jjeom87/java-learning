package net.sunj.learning.books.jabook.ch04;

public class Child extends  Father {
	public Child() {
		System.out.println(" I am Child");
	}

	public void sayChildNumber() {
		for (int i = 0; i < 30; i++) {
			System.out.print(i + "\t");
		}
	}
}