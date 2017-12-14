package net.sunj.learning.tutorials.encoding;

import java.io.UnsupportedEncodingException;

public class CharsetConvertingExample {

	public static void main(String[] args) throws UnsupportedEncodingException {

		System.out.println("system default encoding : " + System.getProperty("file.encoding"));

		String s = "나눔"; // 이 소스 파일이 저장된 형식은 중요하지 않음. (실제로는 "나눔"을 표현하는 유니코드임)

		byte[] bytes1 = s.getBytes();
		byte[] bytes2 = s.getBytes("UTF-8"); // utf-8로 저장된 파일과 같음
		byte[] bytes3 = s.getBytes("EUC-KR"); // euc-kr로 저장된 파일과 같음

		String s1 = new String(bytes1);
		String s2 = new String(bytes2, "UTF-8"); // byte2는 utf-8로 인코딩(저장)되어
													// 있으므로, 알아서 잘 디코딩하라는 뜻임.
		String s3 = new String(bytes3, "EUC-KR");
		String s4 = new String(bytes3, "UTF-8"); // 이것은 깨짐. 왜냐하면 euc-kr로 인코딩된 것을 utf-8로 풀려고 하기 때문임.

		System.out.println("default : " + s1);
		System.out.println("utf-8 : " + s2);
		System.out.println("euc-kr : " + s3);
		System.out.println("잘못된 디코딩 : " + s4);
	}

}
