package org.sunj.jabook.ch09;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputOutputStreamTest {
	public static void main(String[] args) throws IOException {
		System.out.println("아무 글이나 입력하시고 Enter를 쳐주세요");
		System.out.println(" 'S'를 입력하면 프로그램이 종료됩니다.");
		int ch;
		InputStream in = System.in;
		OutputStream out = System.out;
		while ((ch = in.read()) != -1) {
			if (ch == 'S') {
				byte[] arr = new byte[4];
				arr[0] = 83;
				arr[1] = 84;
				arr[2] = 79;
				arr[3] = 80;
				out.write(arr);
				out.flush();
				out.close();
				in.close();
				System.exit(-1);
			}
			System.out.println("Char: " + (char) ch + ", Available: " + in.available());
		}
	}
}