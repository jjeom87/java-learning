package net.sunj.learning.books.headfirst.designpatterns.strategy.sunj.character;

public class Troll extends Character {

	@Override
	public void fight() {
		// TODO Auto-generated method stub
		System.out.println("Troll Fight!");
		weapon.useWeapone();
	}

}
