package net.sunj.learning.books.jabook.ch08;

class MyThread extends Thread {

	private int limit = 0;

	private boolean flag = false;

	public MyThread(int limit) {
		this.limit = limit;
	}

	public void run() {
		int count = 0;
		while (!flag) {
			try {
				this.sleep(100); //스레드가 차례로 실행 되기 위해서 sleep메서드를 사용하여 실행을 양보하게 합니다.
			} catch (InterruptedException e) {}

			if (count == limit) {
				flag = true;
			}
			System.out.println(this.getName() + " : " + count);
			count++;
		}//while

		System.out.println(this.getName() + "종료");
	}
}

public class TerminateThread {
	public static void main(String args[]) {
		System.out.println("작업시작");
		MyThread r1 = new MyThread(6);
		MyThread r2 = new MyThread(8);
		MyThread r3 = new MyThread(5);

		r1.start();
		r2.start();
		r3.start();
		System.out.println("작업종료");
	}
}