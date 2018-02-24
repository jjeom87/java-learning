package org.sunj.jabook.ch06;

class LGTV {
	private int volume;
	
	public LGTV(int v) {
		volume = v;
	}

	public int getVolume() {
		return volume;
	}
}

public class LGTVMain {
	public static void main(String[] args) {
		LGTV t = new LGTV(100);
		System.out.println("LGTV t의 기본볼륨:" + t.getVolume());
		System.out.println("LGTV객체 t의 해시코드:" + t.hashCode());

		LGTV f = t;
		System.out.println("TV f의 기본볼륨:" + f.getVolume());
		System.out.println("LGTV객체 f의 해시코드:" + f.hashCode());
	}

}