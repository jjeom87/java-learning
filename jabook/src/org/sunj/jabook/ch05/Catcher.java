package org.sunj.jabook.ch05;

public class Catcher implements BodySign {

	public void countFinger(int how_ball) {
		if (how_ball == BodySign.STRAIGHT) {
			System.out.println("직구를 던집니다");
		} else if (how_ball == BodySign.CURVE) {
			System.out.println("변화구를 던집니다");
		}
	}

	public void directionBall(int how_direct) {
		if (how_direct == BodySign.UP) {
			System.out.println("상향구를 던집니다.");
		} else if (how_direct == BodySign.DOWN) {
			System.out.println("하향구를 던집니다.");
		} else if (how_direct == BodySign.LEFT) {
			System.out.println("좌향구를 던집니다.");
		} else if (how_direct == BodySign.RIGHT) {
			System.out.println("우향구를 던집니다.");
		}

	}

	public static void main(String[] args) {
		Catcher c = new Catcher();
		c.directionBall(3);//제1구. 좌향구를 던집니다. 
		c.directionBall(BodySign.LEFT);//제2구. 다시 좌향구
		c.countFinger(1);//제3구. 직구를 던집니다. 
		c.countFinger(BodySign.CURVE);//제4구. 변화구를 던집니다.
	}
}