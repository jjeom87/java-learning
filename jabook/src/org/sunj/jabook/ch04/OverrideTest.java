package org.sunj.jabook.ch04;

class FaFa {
	public void print() {
		System.out.println("난 할아버지다");
	}
}

class Baby extends FaFa {
	public void print() {
		System.out.println("난 아버지다");
	}
}

public class OverrideTest {
	public static void main(String[] args) {
		FaFa fafa = new FaFa();
		fafa.print();

		Baby baby = new Baby();
		baby.print();
		
		FaFa faba = new Baby();
		faba.print();
	}

}