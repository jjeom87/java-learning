package net.sunj.learning.books.jabook.ch11;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class NewObjectTest2 {
	public static void main(String[] arg)
		throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
		Class c = String.class;
		Class[] argType = new Class[] { String.class, String.class };
		Constructor con = c.getConstructor(argType); // 찾지 못하면 NoSuchMethodException 발생
		Object[] initArg = new Object[] { "Hello World" };
		Object obj = con.newInstance(initArg);
		if (obj instanceof String) {
			System.out.println("String형이 맞습니다.:" + obj);
		} else {
			System.out.println("Vector형이 아닙니다.");
		}
	}
}