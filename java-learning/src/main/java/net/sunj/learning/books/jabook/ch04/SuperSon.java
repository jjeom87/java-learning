package net.sunj.learning.books.jabook.ch04;

class SuperFather {

	private String name;

	public SuperFather(String name) {
		this.name = name;
		System.out.println("name:" + name);
	}

}

public class SuperSon extends SuperFather {
	public SuperSon(String str) {
		super(str);
	}

	public static void main(String[] args) {
		SuperSon s = new SuperSon("상속의 super Test");
	}

}
