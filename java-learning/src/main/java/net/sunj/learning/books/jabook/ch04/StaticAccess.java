package net.sunj.learning.books.jabook.ch04;

public class StaticAccess {
	public static int sint = 0;
	public int nint = 0;

	public static void main(String[] args) {
		StaticAccess.sint = 3333;
		System.out.println("스태틱직접접근:" + StaticAccess.sint);
	}

}