package net.sunj.learning.tutorials.reflection;

import java.lang.reflect.Array;

public class Array2 {
	public static void main(String args[]) {
		int dims[] = new int[] { 5, 10, 15 };
		System.out.println(dims.length);
		Object arr = Array.newInstance(Integer.TYPE, dims);
		int arrcast1[][][] = (int[][][]) arr;
		System.out.println(arrcast1.length);
		System.out.println(arrcast1[0].length);
		System.out.println(arrcast1[0][0].length);
		Object arrobj = Array.get(arr, 3);
		Class cls = arrobj.getClass().getComponentType();
		System.out.println(cls);
		arrobj = Array.get(arrobj, 5);
		Array.setInt(arrobj, 10, 37);

		int arrcast[][][] = (int[][][]) arr;
		System.out.println(arrcast[3][5][10]);
	}
}
