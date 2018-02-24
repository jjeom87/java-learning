package org.sunj.jabook.ch04;

public class InheritanceTest2 {
	public static void main(String[] args) {
		Child c = new Child();
        System.out.println("GrandFather의 sayGrandNumber");
        c.sayGrandNumber();
        System.out.println();
        System.out.println("Father의 sayFatherNumber");
        c.sayFatherNumber();
        System.out.println();
        System.out.println("Child sayChildNumber");
        c.sayChildNumber();
	}
}