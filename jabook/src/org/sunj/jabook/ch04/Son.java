package org.sunj.jabook.ch04;

public class Son extends MyFather {
	public void sayFatherNames() {
		System.out.println(name);
		// System.out.println(nickname); // Error! The field MyFather.nickname is not visible
	}

	public static void main(String[] args) {
		Son s = new Son();
		s.sayFatherNames();
	}

}