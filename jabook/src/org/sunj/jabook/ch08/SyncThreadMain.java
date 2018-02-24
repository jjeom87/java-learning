package org.sunj.jabook.ch08;

import java.util.Vector;

class SyncStack {

	private Vector buffer = new Vector();

	public synchronized char pop() {
		char c;
		c = ((Character) (buffer.remove(buffer.size() - 1))).charValue();
		return c;
	}

	public void push(char c) {
		synchronized (this) {
			Character charObj = new Character(c);
			buffer.addElement(charObj);
		}
	}
}

class PopThread extends Thread {
	private SyncStack ss = null;
	public PopThread(SyncStack ss) {
		this.ss = ss;
	}

	public void run() {
		System.out.println(this.getName() + "Poping:" + ss.pop() + " OK");
	}
}

class PutThread extends Thread {
	private char c;
	private SyncStack ss = null;

	public PutThread(SyncStack ss, char c) {
		this.ss = ss;
		this.c = c;
	}

	public void run() {
		System.out.println(this.getName() + "Putting Char:" + c);
		ss.push(c);
	}
}

public class SyncThreadMain {

	public static void main(String args[]) {
		System.out.println("Starting SyncTest...");
		SyncStack ss = new SyncStack();

		for (int i = 0; i < 10; i++)
			new PutThread(ss, (char) (i + 33)).start();

		for (int i = 0; i < 10; i++)
			new PopThread(ss).start();
	}
}