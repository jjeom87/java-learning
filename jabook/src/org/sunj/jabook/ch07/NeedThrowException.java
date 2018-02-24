package org.sunj.jabook.ch07;

import java.net.URL;

public class NeedThrowException {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://www.yahoo.co.kr");
		} catch (Exception e) {
			System.out.println("--Exception 발생구문--");
			System.out.println("정보:e.getMessage(): " + e.getMessage());
			System.out.println("정보:e.toString(): " + e.toString());
			System.out.print("정보:e.printStackTrace():");
			e.printStackTrace();
			return;
		} finally {
			System.out.println("finally: 결국이리로 오는군요");
		}
	}

}
