package org.sunj.jabook.ch07;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;

public class RuntimeExceptionTest {

	public void throwsRuntimeException() throws NullPointerException {
	}
	
	public void throwsException() throws FileNotFoundException {
	}

	public static void main(String args[]) {
		RuntimeExceptionTest ret = new RuntimeExceptionTest();
		ret.throwsRuntimeException();	// RuntimeException Class에 자식들은 컴파일단계에서 에러처리를 강제화 하지 않는다.
		try {
			ret.throwsException();	// RuntimeException Class을 제외한 Exception Class에 자식들은 컴파일단계에서 에러처리를 강제화 한다.
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}