package org.sunj.jabook.ch06;

public class ArrayRefMain {
	public void print(String arrayname, int index, int value) {
		System.out.print(" arrayname[" + index + "]:" + value);
	}

	public static void main(String[] args) {
		ArrayRefMain ar = new ArrayRefMain();
		int[] mydream = new int[] { 5, 4, 6, 9, 7, 9 };
		int[] myref1 = mydream;
		int[] myref2 = myref1;

		mydream[0] = 1;
		mydream[1] = 1;
		
		myref1[2] = 2;
		myref1[3] = 3;
		
		myref2[4] = 4;
		myref2[5] = 5;

		for (int i = 0; i < 6; i++) {
			ar.print("mydream", i, mydream[i]);
			ar.print("myref1", i, myref1[i]);
			ar.print("myref2", i, myref2[i]);
			System.out.println();
		}
	}
}