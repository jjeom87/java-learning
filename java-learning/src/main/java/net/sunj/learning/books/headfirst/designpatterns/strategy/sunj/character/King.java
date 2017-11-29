package net.sunj.learning.books.headfirst.designpatterns.strategy.sunj.character;

public class King extends Character {

	@Override
	public void fight() {
		// TODO Auto-generated method stub
		System.out.println("King fight!");
		weapon.useWeapone();
	}

}
