package net.sunj.learning.books.jabook.ch08;

class SoloThread2 extends Thread {//스레드상속

	private int number = 0;

	public SoloThread2(int n) {
		System.out.print(this.getName() + ":스레드시작\t");
		number = n;
	}

	public void run() {
		int i = 0;
		while (i < number) {
			System.out.print(getName() + ":" + i + "\t");
			try {
				this.sleep(100);
			} catch (Exception e) {
				System.out.println(e);
			}
			i++;
		}
		System.out.print(this.getName() + ":스레드종료\t");
	}
}

public class MultiThreadMain {
	public static void main(String args[]) {
		System.out.println("Main메서드종료");
		for (int i = 0; i < 10; i++) {
			new SoloThread2(10).start();
		}

		System.out.println("Main메서드종료");
	}
}