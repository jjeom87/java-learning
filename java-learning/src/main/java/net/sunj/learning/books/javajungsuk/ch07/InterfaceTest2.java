package net.sunj.learning.books.javajungsuk.ch07;

class InterfaceTest2 {
	public static class A {
		void autoPlay(I i) {
			i.play();
		}
	}

	public static interface I {
		public abstract void play();
	}

	public static class B implements I {
		public void play() {
			System.out.println("play in B class");
		}
	}

	public static class C implements I {
		public void play() {
			System.out.println("play in C class");
		}
	}

	public static void main(String[] args) {
		A a = new A();
		a.autoPlay(new B());
		a.autoPlay(new C());
	}
}