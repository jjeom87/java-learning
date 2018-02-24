package org.sunj.tutorials.exam.jjeom;

public class Exam1 {

	public static void main(String[] args) {
		Exam1 exam1 = new Exam1();
		exam1.drawTriangle(5);
	}

	public void drawTriangle(int lineNumber) {
		int c = 0;
		for (int i = lineNumber - 1; i >= 0; i--) {
			for (int r = i; r > 0; r--) {
				System.out.printf(" ");
			}
			
			for (int j = lineNumber - i + c; j > 0; j--) {
				System.out.printf("*");
			}
			c++;
			System.out.printf("\n");
		}
	}
}