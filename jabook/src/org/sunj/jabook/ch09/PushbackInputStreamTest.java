package org.sunj.jabook.ch09;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

public class PushbackInputStreamTest {

	public static void main(String[] args) throws IOException {
		String s = "Java.";
		System.out.println(s);
		byte[] buffer = s.getBytes();
		ByteArrayInputStream in = new ByteArrayInputStream(buffer);
		PushbackInputStream f = new PushbackInputStream(in);

		int c;
		while ((c = f.read()) != -1) {
			switch (c) {
			case 'a':
				if ((c = f.read()) == 'v') {
					System.out.print("o");
				} else {
					System.out.print("b");
					f.unread(c);
				}
				break;
			default:
				System.out.print((char) c);
				break;
			}
		}
	}
}