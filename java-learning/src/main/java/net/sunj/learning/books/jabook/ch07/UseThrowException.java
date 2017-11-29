package net.sunj.learning.books.jabook.ch07;

public class UseThrowException {

	public static void main(String[] args) {
		try {
			throw new Exception("이것이 에러 메시지");
		}

		catch (Exception e) {
			System.out.println("--Exception 발생구문--");
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
