package org.sunj.jabook.ch11;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class AnalysisClassInfo {
	public int temp = 1000;

	public void printShow() {}

	public static void main(String[] args) {

		try {
			Class c = Class.forName("jabook.ch11.AnalysisClassInfo");
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

			System.out.println("====Field [] 얻어내기====");

			Field[] f = c.getFields();
			for (int i = 0; i < m.length; i++)
				System.out.println(f[i].toString());

		} catch (Exception e) {}
	}
}