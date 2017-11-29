package net.sunj.learning.books.headfirst.designpatterns.strategy.sunj.character;

import net.sunj.learning.books.headfirst.designpatterns.strategy.sunj.weapon.WeaponBehavior;

public abstract class Character {
	WeaponBehavior weapon;
	
	abstract public void fight();
	
	public void setWeapon(WeaponBehavior weapon) {
		this.weapon = weapon;
	}
}
