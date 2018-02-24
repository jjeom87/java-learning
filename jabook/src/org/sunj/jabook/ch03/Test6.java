package org.sunj.jabook.ch03;

public class Test6 {
	private int sum;
	private int mul;

	public void setValue(int x, int y) {
		sum = x + y;
		mul = x * y;
	}

	public int getValue() {
		int s = sum + mul;
		return s;
	}

}