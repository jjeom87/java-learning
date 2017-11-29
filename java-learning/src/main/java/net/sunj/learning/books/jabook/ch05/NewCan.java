package net.sunj.learning.books.jabook.ch05;

public class NewCan extends EmptyCan {
	public void sound() {
		System.out.println("EmptyCan:빈깡통은 소리가 요란하다");
	}

	public void who() {
		System.out.println("EmptyCan:나는 빈깡통입니다.");
	}

	public void sayHello() {
		System.out.println("NewCan:추상클래스 테스트입니다.");
	}

	public static void main(String args[]) {
		NewCan ecm = new NewCan();
		ecm.who();
		ecm.sound();
		ecm.sayHello();
	}

}
