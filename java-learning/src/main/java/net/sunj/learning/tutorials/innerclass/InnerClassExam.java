package net.sunj.learning.tutorials.innerclass;

import net.sunj.learning.tutorials.innerclass.Outer.Inner;

class Outer {
	int value = 10;
	
	class Inner {
		int value = 20;
		
		public void bb() {
			int value = 30;
			
			System.out.println(value); // 30
			System.out.println(this.value); // 20
			System.out.println(Outer.this.value); // 10
		}
	}
}
public class InnerClassExam {

	public static void main(String[] args) {
		Inner i = new Outer().new Inner();
		i.bb();
	}

}
