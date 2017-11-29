package net.sunj.learning.books.headfirst.java.chap16;

import java.util.ArrayList;

public class TestGenerics2 {

	public static void main(String[] args) {
		new TestGenerics2().go();
	}

	public void go() {
		ArrayList<Animal> animals = new ArrayList<>();
		animals.add(new Dog());
		animals.add(new Cat());
		animals.add(new Dog());
		
		takeAnimals(animals);
		
		ArrayList<Dog> dogs = new ArrayList<>();
		dogs.add(new Dog());
		dogs.add(new Dog());
		dogs.add(new Dog());
		
		// takeAnimals(dogs); 컴파일 오류
		takeAnimals2(dogs);
		
		
		
	}

	public void takeAnimals(ArrayList<Animal> animals) {
		animals.add(new Cat());
		for (Animal a : animals) {
			a.eat();
		}
	}
	
	public void takeAnimals2(ArrayList<? extends Animal> animals) {
		// animals.add(new Cat()); 컴파일 오류
		for (Animal a : animals) {
			a.eat();
		}
	}
	
	// takeAnimals2 와 똑같은 기능을 한다.
	// 이런 방법이 있는 이유는 T 인자를 사용할 때 한 번만 쓰는게 효율적이기 때문에 사용
	// takeAnimals4 보다 takeAnimal5가 더 효율적이다.
	public <T extends Animal> void takeAnimals3(ArrayList<T> animals) {
		// animals.add(new Cat()); 컴파일 오류
		for (Animal a : animals) {
			a.eat();
		}
	}
	public void takeAnimals4(ArrayList<? extends Animal> animals, ArrayList<? extends Animal> animals2) {
		// animals.add(new Cat()); 컴파일 오류
		for (Animal a : animals) {
			a.eat();
		}
	}
	
	public <T extends Animal> void takeAnimals5(ArrayList<T> animals, ArrayList<T> animals2) {
		// animals.add(new Cat()); 컴파일 오류
		for (Animal a : animals) {
			a.eat();
		}
	}

	abstract class Animal {
		void eat() {
			System.out.println("animal eating");
		}
	}
	
	class Dog extends Animal {
		void bark() {
			
		}
	}
	
	class Cat extends Animal {
		void meow() {
		}
	}
}
