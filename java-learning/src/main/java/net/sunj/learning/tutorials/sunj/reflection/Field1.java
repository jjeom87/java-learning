package net.sunj.learning.tutorials.sunj.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Field1 {
	private double d;
	public static final int i = 37;
	String s = "testing";

	public static void main(String args[]) {
		try {
			Class cls = Class.forName("net.sunj.learning.java.reflection.ex03.Field1");

			Field fieldlist[] = cls.getDeclaredFields();
			for (int i = 0; i < fieldlist.length; i++) {
				Field fld = fieldlist[i];
				System.out.println("name = " + fld.getName());
				System.out.println("decl class = " + fld.getDeclaringClass());
				System.out.println("type = " + fld.getType());
				int mod = fld.getModifiers();
				System.out.println("modifiers = " + Modifier.toString(mod));
				System.out.println("-----");
			}
		} catch (Throwable e) {
			System.err.println(e);
		}
	}
}
