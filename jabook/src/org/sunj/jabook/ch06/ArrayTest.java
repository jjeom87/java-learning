package org.sunj.jabook.ch06;

public class ArrayTest {
	public static void main(String[] args) {
		int[] mydream = new int[] { 5, 4, 6, 9, 7, 9 };
		int[] mytarget = { 100, 200, 300, 400, 500, 600, 700 };

		System.arraycopy(mydream, 2, mytarget, 3, 4);
		for (int i = 0; i < mytarget.length; i++) {
			System.out.println("mytarget[" + i + "]:" + mytarget[i]);
		}

	}
}