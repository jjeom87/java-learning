package net.sunj.learning.books.jabook.ch10;

class ObjectTest1 {
}

class ObjectTest2 extends Object {
}

public class ObjectTestMain {
	public static void main(String[] args) {
		ObjectTest1 obj1 = new ObjectTest1();
		System.out.println("ObjectTest1 : " + obj1.toString());

		ObjectTest2 obj2 = new ObjectTest2();
		System.out.println("ObjectTest2 : " + obj2.toString());
	}
}