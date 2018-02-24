package org.sunj.tutorials.string;

public class StringSplitTest {

	public static void main(String[] args) {
		String cusNm = "엄 컴 퍼     니";
		System.out.println(cusNm.split("\\s+")[3]);
	}

}
