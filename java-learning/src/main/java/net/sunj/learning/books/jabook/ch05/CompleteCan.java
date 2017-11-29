package net.sunj.learning.books.jabook.ch05;

public class CompleteCan extends IncompleteCan {

	@Override
	public void who() {
		System.out.println("EmptyCan:나는 빈깡통입니다.");
	}

	public void sayHello() {
		System.out.println("NewCan:추상클래스 테스트입니다.");
	}

	public static void main(String args[]) {
		CompleteCan cc = new CompleteCan();
		cc.who();
		cc.sound();
		cc.sayHello();
	}

}