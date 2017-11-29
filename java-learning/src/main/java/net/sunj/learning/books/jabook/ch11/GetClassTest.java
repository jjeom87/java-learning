package net.sunj.learning.books.jabook.ch11;

public class GetClassTest {
	public static void main(String[] args) throws Exception {
		String s = new String("Hello World Java");
		Class c1 = s.getClass();
		Class c2 = Class.forName("java.lang.String");
		Class c3 = String.class;
		System.out.println("c1 getClass:" + c1.getName());
		System.out.println("c1 forName:" + c1.getName());
		System.out.println("c1 String.class:" + c1.getName());
	}
}