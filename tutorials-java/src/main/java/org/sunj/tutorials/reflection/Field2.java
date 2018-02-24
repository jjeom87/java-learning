package org.sunj.tutorials.reflection;

import java.lang.reflect.Field;

public class Field2 {
	public double d;

	public static void main(String args[]) {
		try {
			Class cls = Class.forName("net.sunj.learning.java.reflection.ex03.Field2");
			Field fld = cls.getField("d");
			Field2 f2obj = new Field2();
			System.out.println("d = " + f2obj.d);

			fld.setDouble(f2obj, 12.34);
			System.out.println("d = " + f2obj.d);
		} catch (Throwable e) {
			System.err.println(e);
		}
	}
}