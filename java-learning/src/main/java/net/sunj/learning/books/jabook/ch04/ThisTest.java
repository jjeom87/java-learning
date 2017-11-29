package net.sunj.learning.books.jabook.ch04;

public class ThisTest {
	private int number;
	private String name;

	public ThisTest(String name, int number) {
		//this를 이용한 매개변수와의 구분
		this.name = name;
		this.number = number;
	}

	public void print() {
		System.out.println("-- this를 이용한 멤버 테스트---");
		System.out.println("name:" + this.name + " number:" + this.number);
	}

	public void myprint() {
		System.out.println("-- this를 이용한 메서드 테스트---");
		this.print();
	}

	public static void main(String[] args) {
		ThisTest th = new ThisTest("홍길동", 20);
		th.print();
		th.myprint();
	}

}