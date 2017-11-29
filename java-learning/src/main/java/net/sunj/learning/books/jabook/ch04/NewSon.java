package net.sunj.learning.books.jabook.ch04;

class NewFather {
	public void overrideFunc() {
		System.out.println("아버지의 함수");
	}
}

public class NewSon extends NewFather {
	public void overrideFunc() {
		System.out.println("아들의 재정의 함수");
	}

	public void testFunc() {
		super.overrideFunc();
	}

	public static void main(String[] args) {
		NewSon s = new NewSon();
		s.overrideFunc();//재정의 된 함수호출
		s.testFunc();//super를 이용한 아버지 호출
	}

}
