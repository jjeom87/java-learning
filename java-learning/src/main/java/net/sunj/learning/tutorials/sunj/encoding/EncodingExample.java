package net.sunj.learning.tutorials.sunj.encoding;

import java.io.UnsupportedEncodingException;

public class EncodingExample {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String message = "오야야야";
		// 예상과는 다른 동작을 하는 코드
		String convert = new String(message.getBytes("euc-kr"), "utf-8");
		System.out.println("convert : " + convert);
//		이건 잘못된 API의 이해가 부른 오동작 코드 이다.
//		String::getBytes 는 자바 내부에 관리되는 유니코드 문자열을 인자로 지정된 캐릭터셋의 바이트 배열로 반환하는 메서드이며,
//		new String(바이트배열, 캐릭터셋) 생성자는 해당 바이트 배열을 주어진 캐릭터 셋으로 간주 하여 스트링을 만드는 생성자이다.
		
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
		
		// UTF-8 캐릭터셋으로 배열된 바이트배열은 UTF-8로 해석 해야 한다.
		System.out.println(new String(utf8, "UTF-8"));
		
	}

}
