package net.sunj.learning.books.headfirst.designpatterns.strategy.sunj;

import net.sunj.learning.books.headfirst.designpatterns.strategy.sunj.character.Character;
import net.sunj.learning.books.headfirst.designpatterns.strategy.sunj.character.King;
import net.sunj.learning.books.headfirst.designpatterns.strategy.sunj.character.Knight;
import net.sunj.learning.books.headfirst.designpatterns.strategy.sunj.weapon.BowAndArrowBehavior;

public class CharacterBehaviorSimulrator {

	public static void main(String[] args) {
		Character character = new King();
		character.setWeapon(new BowAndArrowBehavior());
		character.fight();
		
		character = new Knight();
		character.fight();
	}
}