package org.sunj.jabook.ch09;

import java.io.RandomAccessFile;

public class RandomAccessFileTest {
	static String s = "ILoveJava~";
	static String q = "Jabook!";

	public static void main(String[] args) throws Exception {
		RandomAccessFile rf = new RandomAccessFile("src/jabook/ch09/RandomAccessTest.txt", "rw");
		rf.writeChars(s);
		rf.close();
		rf = new RandomAccessFile("src/jabook/ch09/RandomAccessTest.txt", "rw");

		rf.seek(10);
		rf.writeChars(q);
		rf.close();
		rf = new RandomAccessFile("src/jabook/ch09/RandomAccessTest.txt", "r");

		System.out.println("글내용은" + rf.readLine());

		rf.close();
	}
}