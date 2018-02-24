package org.sunj.jabook.ch08;

class SoloRunnable implements Runnable {

	private int number = 0;

	public SoloRunnable(int n) {
		System.out.println(":스레드시작");
		number = n;
	}

	public void run() {
		int i = 0;
		while (i < number) {
			System.out.print(i + "\t");
			i++;
		}
		System.out.println(":스레드종료");
	}
}

public class SoloRunnableMain {
	public static void main(String args[]) {
		new Thread(new SoloRunnable(10)).start();
	}
}