package net.sunj.learning.books.jabook.ch08;

import java.util.Date;

public class ThreadSleepTest {

	public static void main(String[] args) {
		System.out.println("프로그램시작:" + new Date().toString());
		try {
			Thread.sleep(5000);//5초의 지연효과를 가지고 있습니다. 
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("프로그램시작:" + new Date().toString());
	}
}