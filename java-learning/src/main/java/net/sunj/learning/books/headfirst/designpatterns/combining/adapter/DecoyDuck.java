package net.sunj.learning.books.headfirst.designpatterns.combining.adapter;

public class DecoyDuck implements Quackable {
	public void quack() {
		System.out.println("<< Silence >>");
	}
}
