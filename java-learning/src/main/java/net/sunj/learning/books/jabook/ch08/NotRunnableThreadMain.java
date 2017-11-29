package net.sunj.learning.books.jabook.ch08;

import java.util.Date;

class NotRunnableThread extends Thread {//스레드상속

	private int number = 0;

	public NotRunnableThread(int n) {
		System.out.println(this.getName() + ":스레드시작");
		number = n;
	}

	public void run() {
		int i = 0;
		while (i < number) {
			System.out.println(this.getName() + ":" + i + new Date().toString() + "\t");
			try {
				this.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
			i++;
		}
		System.out.println(":스레드종료");
	}
}

public class NotRunnableThreadMain {
	public static void main(String args[]) {
		NotRunnableThread s = new NotRunnableThread(10);
		s.start();
	}
}