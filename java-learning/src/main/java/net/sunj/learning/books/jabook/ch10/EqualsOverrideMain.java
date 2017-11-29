package net.sunj.learning.books.jabook.ch10;

class EqualsOverride {
	private String name;
	private int id;

	public EqualsOverride(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public boolean equals(Object obj) {
		if (obj instanceof EqualsOverride) {
			EqualsOverride eo = (EqualsOverride) obj;
			return name.equals(eo.getName());
		} else {
			return false;
		}
	}

	public String toString() {
		return name + " " + id;
	}
}

public class EqualsOverrideMain {

	public static void main(String[] args) {
		EqualsOverride e1 = new EqualsOverride("홍길동", 1000);
		EqualsOverride e2 = new EqualsOverride("홍길동", 2000);
		System.out.println("e1 : " + e1);
		System.out.println("e2 : " + e2);
		System.out.println("e2.toString() : " +  e2.toString());
		System.out.println("e1 == e2 : " + (e1 == e2));
		System.out.println("e1.eqauls(e2) : " + e1.equals(e2));
	}
}