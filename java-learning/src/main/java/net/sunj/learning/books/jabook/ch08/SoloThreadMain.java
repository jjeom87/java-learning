package net.sunj.learning.books.jabook.ch08;

class SoloThread extends Thread {//스레드상속

	private int number = 0;

	public SoloThread(int n) {
		System.out.println(this.getName() + ":스레드시작");
		number = n;
	}

	public void run() {
		int i = 0;
		while (i < number) {
			System.out.print(this.getName() + ": " + i + "\t");
			i++;
		}
		System.out.println(this.getName() + ":스레드종료");
	}
}

public class SoloThreadMain {

	public static void main(String[] args) {
		new SoloThread(10).start();
	}

}