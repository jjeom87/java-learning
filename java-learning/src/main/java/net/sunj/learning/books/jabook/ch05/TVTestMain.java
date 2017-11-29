package net.sunj.learning.books.jabook.ch05;

public class TVTestMain {

	public static void main(String[] args) {
		TVBoard s = new SSgTV();
		s.powerOnOff(true);//TV를 켭니다. 
		s.channelUp();//채널을 올립니다.
		s.volumeUp();
		s.volumeUp();
		s.volumeUp();
		s.volumeUp();//볼륨을 올립니다.
		s.powerOnOff(false);
		System.out.println();

		TVBoard g = new LGgTV();
		g.powerOnOff(true);//TV를 켭니다. 
		g.channelUp();//채널을 올립니다.
		g.channelUp();
		g.channelUp();
		g.channelUp();
		g.volumeDown();
		g.volumeDown();
		g.volumeDown();
		g.powerOnOff(false);
	}

}