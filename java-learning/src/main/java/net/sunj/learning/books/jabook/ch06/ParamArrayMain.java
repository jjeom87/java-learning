package net.sunj.learning.books.jabook.ch06;

class ParamArray {
	private int[] des;

	public int[] copyArray(int[] source) {
		this.des = new int[source.length];
		for (int i = 0; i < source.length; i++)
			this.des[i] = source[i];

		return this.des;
	}

	public void copyArray(int[] source, int[] target) {
		for (int i = 0; i < source.length; i++)
			target[i] = source[i];
	}

}

public class ParamArrayMain {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		int[] tar = new int[5];

		ParamArray p = new ParamArray();
		int[] result = p.copyArray(arr);

		for (int i = 0; i < result.length; i++) {
			System.out.println("result[" + i + "]:" + result[i]);
		}

		p.copyArray(arr, tar);
		
		for (int i = 0; i < tar.length; i++) {
			System.out.println("tar[" + i + "]:" + tar[i]);
		}
	}

}