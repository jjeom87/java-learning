package org.sunj.jabook.ch10;

public class EqualObjectMain {

	public static void main(String[] args) {
		String str1 = new String("안녕하세요");
		String str2 = new String("안녕하세요");
		
		System.out.println("str1 : " + str1);	// 참조값의 비교
		System.out.println("str2 : " + str2);	// 내용의 비교

		System.out.println("str1 == str2 : " + (str1 == str2));
		System.out.println("str1.eqauls(str2) : " + str1.equals(str2));
	}
}