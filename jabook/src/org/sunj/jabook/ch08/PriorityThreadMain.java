package org.sunj.jabook.ch08;

class SoloThread3 extends Thread {//스레드상속

	private int number = 0;

	public SoloThread3(int n) {
		System.out.print(this.getName() + ":스레드시작\t");
		number = n;
	}

	public void run() {
		int i = 0;
		while (i < number) {
			System.out.print(getName() + ":p:" + this.getPriority() + ":" + i + "\t");
			try {
				this.sleep(1);
			} catch (Exception e) {
				System.out.println(e);
			}
			i++;
		}
		System.out.println("\n" + this.getName() + ":p:" + this.getPriority() + ":스레드종료\t");
	}
}

public class PriorityThreadMain {

	public static void main(String args[]) {
		System.out.println("Main메서드시작");
		System.out.println("Thread.MAX_PRIORITY:" + Thread.MAX_PRIORITY);
		System.out.println("Thread.MIN_PRIORITY:" + Thread.MIN_PRIORITY);
		System.out.println("Thread.NORM_PRIORITY:" + Thread.NORM_PRIORITY);

		for (int i = Thread.MIN_PRIORITY; i < Thread.MAX_PRIORITY + 1; i++) {
			SoloThread3 s = new SoloThread3(100);
			s.setPriority(i);
			s.start();
		}
		System.out.println("Main메서드종료");
	}
}
