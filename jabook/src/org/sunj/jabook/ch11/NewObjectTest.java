package org.sunj.jabook.ch11;

import java.util.Vector;

public class NewObjectTest {
	public static void main(String[] arg) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Object object = null;
		Class c = Class.forName("java.util.Vector");
		object = c.newInstance();
		if (object instanceof Vector) {
			System.out.println("Vector형이 맞습니다.");
		} else {
			System.out.println("Vector형이 아닙니다.");
		}
	}
}