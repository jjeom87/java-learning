package net.sunj.learning.books.jabook.ch09;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayStreamTest {

	public static void main(String[] args) throws IOException {
		int i;
		byte[] arr = { (byte) 'j', (byte) 'a', (byte) 'b', (byte) 'o', (byte) 'o', (byte) 'k' };

		ByteArrayInputStream in = new ByteArrayInputStream(arr);
		ByteArrayOutputStream out = new ByteArrayOutputStream();

		while ((i = in.read()) != -1) {
			out.write(i);
		}

		System.out.println(out.toString());
		in.close();
		out.close();
	}
}