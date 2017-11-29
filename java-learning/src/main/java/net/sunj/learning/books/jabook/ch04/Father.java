package net.sunj.learning.books.jabook.ch04;

public class Father extends GrandFather {
	public Father() {
		System.out.println(" I am Father ");
	}

	public void sayFatherNumber() {
		for (int i = 0; i < 20; i++) {
			System.out.print(i + "\t");
		}
	}

}