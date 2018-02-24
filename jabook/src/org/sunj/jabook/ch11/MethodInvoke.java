package org.sunj.jabook.ch11;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodInvoke {

	public static void main(String[] arg)
			throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException,
			NoSuchMethodException, IllegalAccessException, InvocationTargetException {

		Class c = String.class;
		Class[] parameterTypes = new Class[] { int.class, int.class };
		Method m = c.getMethod("substring", parameterTypes);
		Object[] arguments = new Object[] { new Integer(6), new Integer(11) };
		String s = "Hello World";
		Object result = m.invoke(s, arguments);
		System.out.println(result.toString());
	}

}