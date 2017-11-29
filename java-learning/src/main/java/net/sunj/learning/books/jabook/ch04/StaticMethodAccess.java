package net.sunj.learning.books.jabook.ch04;

public class StaticMethodAccess {
	private static int sint = 100;
	public int nint = 0;

	public static void setStaticInt(int x) {
		sint = x;
	}

	public static int getStaticInt() {
		return sint;
	}

	public static void main(String[] args) {
		StaticMethodAccess.setStaticInt(33333);
		int s = StaticMethodAccess.getStaticInt();

		System.out.println("스태틱값은:" + s);
	}

}