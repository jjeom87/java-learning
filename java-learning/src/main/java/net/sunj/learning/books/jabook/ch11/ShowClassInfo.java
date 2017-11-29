package net.sunj.learning.books.jabook.ch11;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ShowClassInfo {
	public void printShow() {}

	public static void main(String[] args) {
		try {

			List<String> result = new ArrayList<>();
			for (Package p : Package.getPackages()) {
				System.out.println(p.getName());
			}

			Class<?> c = Class.forName("jabook.ch11.ShowClassInfo");
			Package[] pakges = c.getPackage().getPackages();
			for (int j = 0; j < pakges.length; j++) {
				System.out.println("11" + pakges[j].getName());
				System.out.println("22" + pakges[j].getImplementationTitle());
			}

			System.out.println("====Superclass 얻어내기====" + c.getPackage().getName());

			Class<?> cla = c.getSuperclass();

			System.out.println(cla.toString());

			System.out.println("==Constructor [] 얻어내기==");

			Constructor[] ctor = c.getConstructors();

			for (int i = 0; i < ctor.length; i++)
				System.out.println(ctor[i].toString());

			System.out.println("====Method [] 얻어내기====");

			Method[] m = c.getMethods();

			for (int i = 0; i < m.length; i++)
				System.out.println(m[i].toString());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}