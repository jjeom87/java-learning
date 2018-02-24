package org.sunj.jabook.ch06;

public class TwoDimensionMain {
	public static void main(String[] args) {
		int[][] mydream1 = new int[][] { { 100, 200, 300 }, { 400, 500, 600 } };
		int[][] mydream2 = { { 1000, 2000, 3000 }, { 4000, 5000, 6000 } };

		System.out.println("mydream1의 갯수:" + mydream1.length);
		System.out.println("mydream1[0]의 갯수:" + mydream1[0].length);
		System.out.println("mydream1[1]의 갯수:" + mydream1[1].length);
		
		System.out.println("mydream2의 갯수:" + mydream2.length);
		System.out.println("mydream2[0]의 갯수:" + mydream2[0].length);
		System.out.println("mydream2[1]의 갯수:" + mydream2[1].length);

		for (int i = 0; i < mydream1.length; i++)
			for (int j = 0; j < mydream1[i].length; j++)
				System.out.println("mydream1[" + i + "][" + j + "]=>" + mydream1[i][j] + "\t");
		
		for (int i = 0; i < mydream2.length; i++)
			for (int j = 0; j < mydream2[i].length; j++)
				System.out.println("mydream2[" + i + "][" + j + "]=>" + mydream2[i][j] + "\t");

	}

}