package net.sunj.learning.utils.string;

import java.io.UnsupportedEncodingException;

public class JavaCharacterSetTest {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		System.out.println(new String(new byte[0]).length());
		
		
		String name = new String("한민호");
		byte[] strs = name.getBytes();	// getBytes에 인자가 없으면 System.getProperty("file.encoding") 디폴트 캐릭터셋으로 바이트 배열이 리턴된다.
		System.out.println("Length : " + strs.length);
		System.out.println("Hex    : " + BinToHex(strs));
		System.out.println("Value  : " + new String(strs));
		System.out.println();
		
		strs = name.getBytes("utf-8");
		System.out.println("Length : " + strs.length);
		System.out.println("Hex    : " + BinToHex(strs));
		System.out.println("Value  : " + new String(strs, "utf-8"));
		System.out.println();
		
		name = new String(strs, "utf-8");
		strs = name.getBytes();
		System.out.println("Length : " + strs.length);
		System.out.println("Hex    : " + BinToHex(strs));
		System.out.println("Value  : " + name);
		System.out.println();
		
		String convert = new String(name.getBytes("euc-kr"), "utf-8");
		System.out.println(convert);
		strs = convert.getBytes();
		System.out.println("Length : " + strs.length);
		System.out.println("euc-kr Hex    : " + BinToHex(strs));
		strs = convert.getBytes("utf-8");
		System.out.println("Length : " + strs.length);
		System.out.println("utf-8 Hex    : " + BinToHex(strs));
		System.out.println();
		System.out.println();
		System.out.println("file.encoding : " + System.getProperty("file.encoding"));
		

	}

	public static String BinToHex(byte[] buf) {
		String res = "";
		String token = "";
		for (int ix = 0; ix < buf.length; ix++) {
			token = Integer.toHexString(buf[ix]);
			//   CommonUtil.println("[" + ix + "] token value : " + token + " len : " + token.length());
			if (token.length() >= 2) {
				token = token.substring(token.length() - 2);
			} else {
				for (int jx = 0; jx < 2 - token.length(); jx++) {
					token = "0" + token;
				}
			}
			res += " " + token;
		}

		return res.toUpperCase();
	}

}
