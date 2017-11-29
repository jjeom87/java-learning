package net.sunj.learning.books.headfirst.designpatterns.strategy.sunj.character;

public class Knight extends Character {

	@Override
	public void fight() {
		// TODO Auto-generated method stub
		System.out.println("Knight fight!");
		weapon.useWeapone();
	}

}
