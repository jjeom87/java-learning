package net.sunj.learning.books.jabook.ch05;

abstract class Shape {
	public abstract void draw();
	public abstract void delete();
}

class Circle extends Shape {
	public void draw() {
		System.out.println("원을 그립니다");
	}

	public void delete() {
		System.out.println("원모양을 지웁니다");
	}

}

class Triangle extends Shape {
	public void draw() {
		System.out.println("삼각형을 하나, 둘, 셋, 그립니다.");
	}

	public void delete() {
		System.out.println("삼각형을 지웁니다");
	}
}

class Rectangle extends Shape {
	public void draw() {
		System.out.println("사각형을 원, 투, 쓰리, 포 그립니다.");
	}

	public void delete() {
		System.out.println("사각형을 지웁니다");
	}
}

//abstract을 테스트하기 위한 클래스

public class FigureTest {

	public static void main(String[] args) {
		Circle c = new Circle();
		Triangle t = new Triangle();
		Rectangle r = new Rectangle();

		c.draw();
		t.draw();
		r.draw();
		
		c.delete();
		t.delete();
		r.delete();
	}

}
