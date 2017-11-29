package net.sunj.learning.books.javajungsuk.ch07;

class BindingTest2 {
	public static void main(String[] args) {
		Parent p = new Child();
		Child c = new Child();

		System.out.println("p.x = " + p.x);
		p.method();

		System.out.println("c.x = " + c.x);
		c.method();
	}

	public static class Parent {
		int x = 100;

		void method() {
			System.out.println("Parent Method");
		}
	}

	public static class Child extends Parent {
	}
}
