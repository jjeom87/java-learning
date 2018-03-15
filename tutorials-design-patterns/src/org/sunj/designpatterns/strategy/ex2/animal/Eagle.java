package org.sunj.designpatterns.strategy.ex2.animal;

import org.sunj.designpatterns.strategy.ex2.cry.BirdCry;
import org.sunj.designpatterns.strategy.ex2.fly.FlyWithWings;

public class Eagle extends Animal {
	
	public Eagle(){
		
		cry = new BirdCry();
		
		fly = new FlyWithWings();
	}
	
	public void display(){
		
		System.out.println("독수리");
	}

}
