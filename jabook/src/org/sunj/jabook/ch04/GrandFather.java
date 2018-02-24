package org.sunj.jabook.ch04;

public class GrandFather {
	public GrandFather() {
		System.out.println(" I am GrandFather ");
	}

	public void sayGrandNumber() {
		for (int i = 0; i < 10; i++) {
			System.out.print(i + "\t");
		}
	}
}