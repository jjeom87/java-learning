package org.sunj.jabook.ch03;

public class Test3 {

	public static void main(String[] args) {
		PERSON brother = new PERSON();
		brother.age = 100;
		brother.height = 170L;
		// brother.weight = 67.0F; // The field PERSON.weight is not visible Exception
		System.out.println("age:" + brother.age);
		System.out.println("height:" + brother.height);
		// System.out.println("weight:" + brother.weight);
	}

}