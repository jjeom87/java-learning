package net.sunj.learning.books.jabook.ch05.upcasting;

class Shape {
	public void draw() {
		System.out.println("모양을 그립니다");
	}

	public void delete() {
		System.out.println("모양을 지웁니다");
	}
}

class Circle extends Shape {
	public void draw() {
		System.out.println("원을 그립니다");
	}

	public void delete() {
		System.out.println("원모양을 지웁니다");
	}

	public void sayCircle() {
		System.out.println("안녕하세요 원입니다");
	}
}

class Triangle extends Shape {
	public void draw() {
		System.out.println("삼각형을 하나, 둘, 셋, 그립니다.");
	}

	public void delete() {
		System.out.println("삼각형을 지웁니다");
	}

	public void sayTriangle() {
		System.out.println("안녕하세요 삼각형입니다");
	}
}

class Rectangle extends Shape {
	public void draw() {
		System.out.println("사각형을 원, 투, 쓰리, 포 그립니다.");
	}

	public void delete() {
		System.out.println("사각형을 지웁니다");
	}

	public void sayRect() {
		System.out.println("안녕하세요 사각형입니다");
	}
}

public class UpCastingClassTest {
	public static void main(String[] args) {
		Shape s = new Shape();
		s.draw();
		s.delete();
		System.out.println();

		//클래스의 기본적인 사용법
		Circle c = new Circle();
		c.draw();
		c.delete();
		c.sayCircle();
		System.out.println();

		Triangle t = new Triangle();
		t.draw();
		t.delete();
		t.sayTriangle();
		System.out.println();

		Rectangle r = new Rectangle();
		r.draw();
		r.delete();
		r.sayRect();
		System.out.println();

		//Upcasting의 사용
		Shape c1 = new Circle();
		c1.draw();
		c1.delete();
		//c1.sayCircle();  에러가 발생합니다.
		System.out.println();

		Shape t1 = new Triangle();
		t1.draw();
		t1.delete();
		//t1.sayTriangle(); 에러가 발생합니다.
		System.out.println();

		Shape r1 = new Rectangle();
		r1.draw();
		r1.delete();
		//r1.sayRect(); 에러가 발생합니다.
	}
}
