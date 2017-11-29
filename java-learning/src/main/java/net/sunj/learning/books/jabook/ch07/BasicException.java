package net.sunj.learning.books.jabook.ch07;

public class BasicException {

	public static void main(String[] args) {
		try {
			int[] exArray = new int[4];
			exArray[0] = 0;
			exArray[1] = 100;
			exArray[2] = 200;
			exArray[3] = 300;

			//고위로 에러유발: Array의 범위를 벗어나도록 한다.
			for (int i = 0; i < exArray.length + 1; i++)
				System.out.println("exArray[" + i + "]=" + exArray[i]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("--ArrayIndexOutOfBoundsException 발생구문--");
			System.out.println("정보:e.getMessage(): " + e.getMessage());
			System.out.println("정보:e.toString(): " + e.toString());
			System.out.print("정보:e.printStackTrace():");
			e.printStackTrace();
			return;
		} finally {
			System.out.println("finally: 결국이리로 오는군요");
		}
	}
}