package net.sunj.learning.books.jabook.ch04;

public class SpecialThis {
	private int i = 0;

	public void plusCount() {
		i++;
	}

	public SpecialThis getMySelf() {
		return this;
	}

	public void print() {
		System.out.println("member i = " + this.i);
	}

	public static void main(String args[]) {
		SpecialThis st = new SpecialThis();
		SpecialThis st2 = st.getMySelf();
		st.print();
		st.plusCount();
		st.print();
		st2.plusCount();
		st2.print();
		st.plusCount();
		st.print();
	}

}