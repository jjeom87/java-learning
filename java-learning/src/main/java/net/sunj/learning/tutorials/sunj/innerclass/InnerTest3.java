package net.sunj.learning.tutorials.sunj.innerclass;

public class InnerTest3 {
	Object iv = new Object() {
		void method() {
		}
	};

	static Object cv = new Object() {
		void method() {
		}
	};

	void myMethod() {
		Object lv = new Object() {
			void method() {
			}
		};
	}
}
