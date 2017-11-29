package net.sunj.learning.books.jabook.ch07;

public class NullErrorMain {

	public static void main(String[] args) {
		try {
			String str = null;
			System.out.println(str.toString());
		} catch (NullPointerException e) {
			System.out.println(e.toString() + "에러가 발생했습니다");
		}
		System.out.println("프로그램의 종료");
	}

}
