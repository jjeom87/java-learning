package net.sunj.learning.books.jabook.ch11;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodInvoke2 {
	public static void main(String[] arg)
			throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException,
			NoSuchMethodException, IllegalAccessException, InvocationTargetException {
		
		Class c = String.class;
		Method m = c.getMethod("length", null);
		String s = "Hello World";
		Object result = m.invoke(s, null);
		System.out.println(result.toString());
	}
}