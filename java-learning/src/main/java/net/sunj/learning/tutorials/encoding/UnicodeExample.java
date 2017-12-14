package net.sunj.learning.tutorials.encoding;

public class UnicodeExample {

	public static void main(String[] args) {
		// String to Unicode
		System.out.println( "\\u" + Integer.toHexString('a' | 0x10000).substring(1) );
		
		// Unicode to String
		String myString = "\\u0048\\u0065\\u006C\\u006C\\u006F World";
		System.out.println(UnicodeToString(myString));
	}

	private static String UnicodeToString(String myString) {
		String str = myString.split(" ")[0];
		str = str.replace("\\","");
		String[] arr = str.split("u");
		String text = "";
		for(int i = 1; i < arr.length; i++){
		    int hexVal = Integer.parseInt(arr[i], 16);
		    text += (char)hexVal;
		}
		return text;
	}
	
}
