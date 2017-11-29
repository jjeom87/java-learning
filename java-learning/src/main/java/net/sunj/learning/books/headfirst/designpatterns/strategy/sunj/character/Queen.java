package net.sunj.learning.books.headfirst.designpatterns.strategy.sunj.character;

public class Queen extends Character {

	@Override
	public void fight() {
		// TODO Auto-generated method stub
		System.out.println("Queen fight!");
		weapon.useWeapone();
	}

}
