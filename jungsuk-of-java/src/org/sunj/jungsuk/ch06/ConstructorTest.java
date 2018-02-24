package org.sunj.jungsuk.ch06;

class ConstructorTest {
	public static class Data1 {
		int value;
	}

	public static class Data2 {
		int value;

		Data2(int x) { // 매개변수가 있는 생성자.
			value = x;
		}
	}

	public static void main(String[] args) {
		Data1 d1 = new Data1();
//		Data2 d2 = new Data2(); // compile error발생
	}
}