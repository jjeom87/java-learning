package org.sunj.tutorials.string.encoding;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.Charset;

public class StringEncoding {

	public static void main(String[] args) throws Exception {
		System.out.println(Charset.defaultCharset());
		// new String(byte[] bytes,Charset charset)
		// 설명대로 2번째 매개변수의 charset 으로 1번째 매개변수의 바이트배열을 디코딩한다고 되어있다. 
		// 2번째 매개변수로 디코딩하려면 1번째가 해당  charset 으로 인코딩되어있어야 원하는 문자를 출력할 수 있다.
		String x = new String("한글".getBytes("EUC-KR"),"UTF-8");	// 글자깨짐
		System.out.println(x);
		String a = new String("한글".getBytes("EUC-KR"),"EUC-KR");	// 정상
		System.out.println(a);
		String b = new String("한글".getBytes("UTF-8"),"UTF-8");		// 정상
		System.out.println(b);
		
		String enCodeStr = URLEncoder.encode("한글", "UTF-8");
		// 한번 잘 못 디코드 된 문자열은 변환이 안된다.
		String deCodeStr = URLDecoder.decode(enCodeStr, "EUC-KR");
		System.out.println("deCodeStr : " + deCodeStr);
		detectCharset(deCodeStr);
		
		String deCodeStr2 = URLDecoder.decode(enCodeStr, "UTF-8");
		System.out.println("deCodeStr2 : " + deCodeStr2);
		detectCharset(deCodeStr2);
		
		
		// detectCharset();
	}
	
	public static void detectCharset(String str) throws Exception {
		String[] charSet = { "utf-8", "euc-kr", "ksc5601", "iso-8859-1", "x-windows-949" };
		for (int i = 0; i < charSet.length; i++) {
			try {
				System.out.println("[" + charSet[i] + "," + charSet[i] + "] = " + new String(str.getBytes(charSet[i]), charSet[i]));
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}
	}

	public static void encodeCharset() throws Exception {
		String text = "미미박스";
		String encode = "";
		String[] charsets = { "UTF-8", "EUC-KR", "ISO-8859-1", "CP1251", "KSC5601" };

		for (String charset : charsets) {
			encode = URLEncoder.encode(text, charset);
			System.out.println("origin[" + text + "], " + "encoded[" + encode + "], charset[" + charset + "]");
		}
	}
	

}
