package net.sunj.learning.utils.exam.jch;

// 1번 문제
import java.util.Scanner;

class Exam1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("숫자입력(삼각형 줄수) : ");

		int row = s.nextInt();
		int var = 0;

		for (int i = 0; i < row; i++) {

			if (var == 10) var = 0;

			if (i == row - 1) {
				for (int j = i; j < row - 1; j++) {
					System.out.print(" ");
				}

				for (int k = 0; k <= (i * 2); k++) {
					if (var == 10) var = 0;

					System.out.print(var);
					var++;
				}

			} else {
				for (int j = i; j < row - 1; j++) {
					System.out.print(" ");
				}

				for (int k = 0; k <= (i * 2); k++) {
					if (var == 10) var = 0;

					if (k == 0 || k == i * 2) {
						System.out.print(var);
						var++;
					} else {
						System.out.print(" ");
					}

				}
			}
			System.out.println("");
		}

	}
}
