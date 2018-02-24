package org.sunj.jabook.ch07;

import java.net.MalformedURLException;
import java.net.URL;

public class PassException {

	public URL makeURL(String urlstr) throws MalformedURLException {
		return new URL(urlstr);
	}

	public static void main(String args[]) {
		PassException p = new PassException();
		try {
			URL url = p.makeURL("http://www.yahoo.co.kr");
			//정확한 URL을 입력하지 않아서 에러발생
			System.out.println(url);
		} catch (MalformedURLException e) {
			System.out.println("--MalformedURLException 발생구문--");
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