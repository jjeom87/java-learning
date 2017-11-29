package net.sunj.learning.utils.string.encoding;

import java.io.UnsupportedEncodingException;

public class StringEncodingTest {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String d = "안녕 親9"; // 자바는 내부 문자열을 모두 유니코드 처리한다
		  
		// 유니코드 문자열을 UTF-8 캐릭터 바이트배열로 변환하여 반환
		byte [] utf8 = d.getBytes("UTF-8");
	
		// 유니코드 문자열을 EUC-KR 캐릭터 바이트배열로 변환하여 반환
		byte [] euckr = d.getBytes("EUC-KR");
		  
		// 당연히 다른 바이트 배열이므로 사이즈가 다르다.
		System.out.println("byte length > " + utf8.length); // byte length > 11
		System.out.println("byte length > " + euckr.length); // byte length > 8
		  
		// 실수 코드.
		// UTF-8 캐릭터셋으로 배열된 바이트배열을 EUC-KR로 해석할 수 없다.
		System.out.println(new String(utf8, "EUC-KR"));
		System.out.println(new String(utf8, "UTF-8"));		
	}
}
