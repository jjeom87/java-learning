package org.sunj.jabook.ch05;

public class SSgTV extends Object implements TVBoard {
	private String name = "SSg TV";
	private int volume = 5;
	private int channel = 7;
	private boolean power = false;
	
	public SSgTV() {
		System.out.println("SSg TV가 만들어 졌습니다");
	}

	public void channelDown() {
		this.channel -= 1;
		System.out.println(this.name + "-채널Down");
	}

	public void channelUp() {
		this.channel += 1;
		System.out.println(this.name + "-채널Up");
	}

	public void volumeDown() {
		this.volume -= 1;
		System.out.println(this.name + "-볼륨Down");
	}

	public void volumeUp() {
		this.volume += 1;
		System.out.println(this.name + "-볼륨Up");
	}

	public void powerOnOff(boolean power) {
		this.power = power;
		if (this.power == false) {
			System.out.println(this.name + "-전원Off");
		} else {
			System.out.println(this.name + "-전원On");
		}
	}

	public void SleepTimer(int time) {
		System.out.println(time + "알람설정후에 자동으로 종료 됩니다.");
		//기다리는 작업
		this.powerOnOff(false);
	}

}
