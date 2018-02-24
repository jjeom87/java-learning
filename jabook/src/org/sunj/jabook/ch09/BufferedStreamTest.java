package org.sunj.jabook.ch09;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamTest {
	public static void main(String[] args) throws IOException {
		BufferedInputStream in = new BufferedInputStream(new FileInputStream("src/jabook/ch09/BufferedStreamTest01.txt"));
		BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("src/jabook/ch09/BufferedStreamTest02.txt"));

		int s1 = 0;
		while ((s1 = in.read()) != -1) {
			out.write(s1);
		}

		in.close();
		out.close();
		System.out.println("Copied...Successfully!");
	}
}