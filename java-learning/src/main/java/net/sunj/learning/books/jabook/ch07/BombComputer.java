package net.sunj.learning.books.jabook.ch07;

public class BombComputer {
	boolean power = false;

	public void powerOn() {
		power = true;
		System.out.println("!!!!폭발물컴퓨터전원 ON.!!!!");
	}

	public void powerOff() {
		power = false;
		System.out.println("!!!!폭발물컴퓨터전원 OFF!!!!");
	}

	public void processJob() throws Exception {
		//작업을 처리
		System.out.println("!!!! 작업처리 1 !!!!");
		System.out.println("!!!! 작업처리 2 !!!!");
		throw new Exception("@!@#곧 폭발합니다.!@#$");
	}

}
