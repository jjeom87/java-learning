package net.sunj.learning.utils.string;

public class StringSubStringTest {

	public static void main(String[] args) {
		String str = "1234567";
		System.out.println(str.substring(0, 6));
		// System.out.println(str.substring(6, 13)); // Exception!! String index out of range: 13
		System.out.println(str.substring(6));
	}

}