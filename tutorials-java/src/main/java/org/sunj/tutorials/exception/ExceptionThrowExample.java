package org.sunj.tutorials.exception;

public class ExceptionThrowExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		/*for(int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i == 3) {
				runTimeException();
			}
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i == 3) {
				exception();
			}
		}*/
		
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i == 3) {
				exception2();
			}
		}
	}
	
	public static void runTimeException() {
		throw new RuntimeException("Throw RuntimeException!!");
	}
	
	public static void exception() throws Exception {
		throw new Exception("Throw exception!!");
	}	
	
	public static void exception2() {
		try {
			throw new Exception("Throw exception2!!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
}
