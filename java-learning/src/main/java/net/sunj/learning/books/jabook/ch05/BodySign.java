package net.sunj.learning.books.jabook.ch05;

public interface BodySign {
	public static final int STRAIGHT = 1;
	public static final int CURVE = 2;
	public static final int DOWN = 1;
	public static final int UP = 2;
	public static final int LEFT = 3;
	public static final int RIGHT = 4;
	
	public void countFinger(int how_ball);
	public void directionBall(int how_direct);

}
