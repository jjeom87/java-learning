package org.sunj.tutorials.innerclass;

public class InnerClassExample2 {
	class InstanceInner {
	}

	static class StaticInner {
	}

	InstanceInner iv = new InstanceInner(); // 인스턴스멤버 간에는 서로 직접 접근이 가능하다.
	static StaticInner cv = new StaticInner(); // static 멤버 간에는 서로 직접 접근이 가능하다.

	static void staticMethod() {
		// InstanceInner obj1 = new InstanceInner(); static 멤버는 인스턴스멤버에 직접 접근할 수
		// 없다.
		StaticInner obj2 = new StaticInner();

		// 굳이 접근하려면 아래와 같이 객체를 생성해야한다.
		InnerClassExample2 outer = new InnerClassExample2(); // 인스턴스클래스는 외부 클래스를 먼저 생성해야만 생성할 수
											// 있다.
		InstanceInner obj1 = outer.new InstanceInner();
	} // staticMethod

	void instanceMethod() {
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner(); // 인스턴스메서드에서는 인스턴스멤버와 static 멤버 모두
												// 접근 가능하다.
		// LocalInner lv = new LocalInner(); 메서드 내에 지역적으로 선언된 내부클래스는 외부에서 접근할 수
		// 없다.
	} // instanceMethod

	void myMethod() {
		class LocalInner {
		}
		LocalInner lv = new LocalInner();
	} // myMethod

}
