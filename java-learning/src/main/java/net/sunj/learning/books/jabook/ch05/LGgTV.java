package net.sunj.learning.books.jabook.ch05;

public class LGgTV extends Object implements TVBoard {
	private String name = "LGg TV";
	private int volume = 5;
	private int channel = 3;
	private boolean power = false;

	public LGgTV() {
		System.out.println("LGg TV가 만들어 졌습니다");
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

	public void AlarmTimer(int time) {
		System.out.println(time + "알람설정후에 자동으로 켜집니다.");
		//기다리는 작업
		this.powerOnOff(true);
	}

}
