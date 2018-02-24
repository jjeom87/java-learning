package org.sunj.jabook.ch04;

public class StaticTime {

	private static int sint = 0;

	static {
		sint = 100;
		System.out.println("sint:" + sint);
	}

	private int nint = 0;

	public static void main(String[] args) {
		StaticTime s = null;
	}

}