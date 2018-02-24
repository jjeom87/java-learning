package org.sunj.jabook.ch16;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class URLTest {
	public static void main(String args[]) {
		try {
			URL home = new URL("http://www.ebiz4u.co.kr/index0.jsp");
			BufferedReader br;
			String line;
			System.out.println("Port: " + home.getPort());
			System.out.println("Protocol: " + home.getProtocol());
			System.out.println("HostName: " + home.getHost());
			System.out.println("File: " + home.getFile());
			System.out.println("Ref: " + home.getRef());
			br = new BufferedReader(new InputStreamReader(home.openStream()));
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
	}
}