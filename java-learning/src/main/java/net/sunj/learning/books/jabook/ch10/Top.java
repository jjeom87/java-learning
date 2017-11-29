package net.sunj.learning.books.jabook.ch10;

public class Top {
	int a = 10;
	int b = 20;

	public static void main(String[] args) {
		Top t = new Top();
		System.out.println(t.hashCode());

		Top s = t;
		System.out.println(s.hashCode());

		Top w = new Top();
		System.out.println(w.hashCode());
	}
}