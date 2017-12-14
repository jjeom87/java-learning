package net.sunj.learning.tutorials.enums;

public class EnumMethodOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Enum1.a.test();
		Enum1.b.test();
	}
	
	
	public static enum Enum1 {
		a("1"){
			public void test() {System.out.println("123123");}
		},
		b("2"){
			
		};
		
		private String c;
		
		private Enum1(String a) {
			this.c = a;
		}
		
		public void test() {
	        throw new AbstractMethodError();
	    }
	}

}

