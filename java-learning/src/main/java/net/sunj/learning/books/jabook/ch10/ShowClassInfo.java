package net.sunj.learning.books.jabook.ch10;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ShowClassInfo {
	public void printShow() {}
	public static void main(String[] args) {

		try {
			Class c = Class.forName("jabook.ch10.ShowClassInfo");
			System.out.println("====Superclass 얻어내기====");

			Class cla = c.getSuperclass();
			System.out.println(cla.toString());
			System.out.println("==Constructor [] 얻어내기==");

			Constructor[] ctor = c.getConstructors();
			for (int i = 0; i < ctor.length; i++)
				System.out.println(ctor[i].toString());

			System.out.println("====Method [] 얻어내기====");
			Method[] m = c.getMethods();
			for (int i = 0; i < m.length; i++)
				System.out.println(m[i].toString());
		} catch (Exception e) {}
	}
}