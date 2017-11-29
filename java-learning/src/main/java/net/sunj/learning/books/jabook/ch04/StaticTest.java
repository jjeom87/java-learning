package net.sunj.learning.books.jabook.ch04;

public class StaticTest {

	private static int sint = 0;
	private int nint = 0;

	public StaticTest() {
		sint = sint + 1;
		nint = nint + 1;
	}

	public void sayMember() {
		System.out.println("sint:" + sint + "  nint:" + nint);
	}

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			StaticTest s = new StaticTest();
			s.sayMember();
		}
	}

}