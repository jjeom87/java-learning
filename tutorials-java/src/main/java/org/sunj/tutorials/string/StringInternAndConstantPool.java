package org.sunj.tutorials.string;

public class StringInternAndConstantPool {

	public static void main(String[] args) {
		String a = "JAVA";
		String b = "JAVA";
		System.out.println("1." + (a == b));
		
		a = new String("JAVA");
		b = "JAVA";
		System.out.println("2." + (a == b));
		
		a = new String("JAVA");
		a = a.intern();
		b = "JAVA";
		System.out.println("3." + (a == b));
	}
}