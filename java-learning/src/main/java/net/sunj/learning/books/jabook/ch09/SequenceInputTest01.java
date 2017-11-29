package net.sunj.learning.books.jabook.ch09;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceInputTest01 {

	public static void main(String[] args) throws IOException {
		int bn;
		byte[] arr = { 'J', 'a', 'v', 'a', ',' };
		ByteArrayInputStream bi = new ByteArrayInputStream(arr);
		FileInputStream fi = new FileInputStream("src/jabook/ch09/sequence.txt");
		SequenceInputStream si = new SequenceInputStream(bi, fi);
		while ((bn = si.read()) != -1) {
			System.out.write(bn);
		}
		System.out.flush();
	}
}