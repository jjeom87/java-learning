package org.sunj.jabook.ch20;

public class HelloWorld {
	static {
		System.loadLibrary("helloworld!");
		System.out.println("=== library was loaded");
	}

	public native void printHelloWorld();

	public static void main(String[] args) throws Exception {
		new HelloWorld().printHelloWorld();
	}
}
