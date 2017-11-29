package net.sunj.learning.books.headfirst.designpatterns.combining.adapter;

public class RubberDuck implements Quackable {
	public void quack() {
		System.out.println("Squeak");
	}
}
