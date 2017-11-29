package net.sunj.learning.books.jabook.ch08;

import java.awt.Frame;

// 이와 같이 다른 것을 상속하고 있을 때 Thread를 상속할 수 없습니다. 그렇기 때문에 Runnable을 이용하여 스레드를 구현하고 있습니다. 
class SoloFrame extends Frame implements Runnable {
	private int number = 0;
	public SoloFrame(int n) {
		System.out.println(":스레드시작");
		number = n;
		new Thread(this).start();
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

public class SoloFrameMain {
	public static void main(String args[]) {
		SoloFrame s = new SoloFrame(100);
		s.setSize(100, 100);
		s.show();
	}
}