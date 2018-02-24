package org.sunj.jabook.ch06;

public class ArrayCloneTest {
	public static void main(String[] args) {
		int[] mydream = new int[] { 5, 4, 6, 9, 7, 9 };
		int[] mytarget = (int[]) mydream.clone();

		for (int i = 0; i < mytarget.length; i++) {
			System.out.println("mytarget[" + i + "]:" + mytarget[i]);
		}
	}

}