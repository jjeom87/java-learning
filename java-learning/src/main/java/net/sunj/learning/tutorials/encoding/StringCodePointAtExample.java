package net.sunj.learning.tutorials.encoding;

public class StringCodePointAtExample {

	public static void main(String[] args) {
		String string = "한글";
		for (int i = 0; i < string.length(); i++) {
			System.out.println(string.codePointAt(i));
			System.out.println(String.format("U+%04X ", string.codePointAt(i)));
		}

		byte[] bytes = string.getBytes();
		for (byte b : bytes) {
			System.out.println(String.format("0x%02X ", b));
		}

	}
}