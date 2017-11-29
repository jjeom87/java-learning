package net.sunj.learning.tutorials.sunj.innerclass;

public class InnerTest2 {
	private int outerIv = 0;
	static int outerCv = 0;

	class InstanceInner {
		int iiv = outerIv; // 외부클래스의 private 멤버도 접근가능하다.
		int iiv2 = outerCv;
	} // InstanceClass InstanceInner

	static class StaticInner {
		// int siv = outerIv; 스태틱클래스는 외부클래스의 인스턴스 멤버에 접근할 수 없다.
		static int scv = outerCv;
	} // staticClass StaticInner

	void myMethod() {
		int lv = 0;
		final int Lv = 0;

		class LocalInner {
			int liv = outerIv;
			int liv2 = outerCv;
			// int liv3 = lv; 외부클래스의 지역변수는 final이 붙은 변수(상수)만 접근가능하다.
			int liv4 = Lv;
		} // InnerClass LocalInner
	} // myMethod
}
