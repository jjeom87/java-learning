package net.sunj.learning.books.jabook.ch16;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
	public static void main(String[] args) {
		InetAddress myIp = null;

		try {
			myIp = InetAddress.getByName("www.ebiz4u.co.kr");
			System.out.println("getHostName : " + myIp.getHostName());
			System.out.println("getHostAddress : " + myIp.getHostAddress());
			System.out.println("toString : " + myIp.toString());
			System.out.println("getLocalHost : " + InetAddress.getLocalHost());
		} catch (UnknownHostException e) {
			System.out.println(e);
		}
	}
}