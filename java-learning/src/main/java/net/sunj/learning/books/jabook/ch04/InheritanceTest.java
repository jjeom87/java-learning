package net.sunj.learning.books.jabook.ch04;

public class InheritanceTest {
	public static void main(String[] args) {
		Father f = new Father();
		System.out.println("GrandFather의 sayGrandNumber");
		f.sayGrandNumber(); // 할아버지의 메서드 호출
		System.out.println();
		System.out.println("Father의 sayFatherNumber");
		f.sayFatherNumber(); // 아버지 자신의 메서드 호출
	}

}