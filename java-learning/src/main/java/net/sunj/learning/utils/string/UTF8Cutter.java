package net.sunj.learning.utils.string;

import java.io.UnsupportedEncodingException;

public class UTF8Cutter {
	public static String cut(String s, int n) throws UnsupportedEncodingException {
		byte[] utf8 = s.getBytes();
		if (utf8.length < n) {
			n = utf8.length;
		}
		
		int n16 = 0;
		int advance = 1;
		int i = 0;
		while (i < n) {
			advance = 1;
			// System.out.println("(utf8[i] & 0x80) : " + (utf8[i] & 0x80));
			if ((utf8[i] & 0x80) == 0) {
				i += 1;
			} else if ((utf8[i] & 0xE0) == 0xC0) {
				i += 2;
			} else if ((utf8[i] & 0xF0) == 0xE0) {
				i += 3;
			} else {
				i += 4;
				advance = 2;
			}
			
			// System.out.println("i : " + i);
			// System.out.println("n : " + n);
			
			if (i <= n) n16 += advance;
		}
		// System.out.println("n16 : " + n16);
		return s.substring(0, n16);
	}
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		System.out.println(cut("안녕하세요", 6));
		System.out.println(cut("안녕하세요", 4));
	}
}

