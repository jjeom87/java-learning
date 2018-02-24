package org.sunj.jabook.ch04;

public class ThisSelf {
	private String name;
	private int age;

	public ThisSelf() {
		this("이름없음");
	}

	public ThisSelf(String name) {
		this(name, -1);
	}

	public ThisSelf(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("name:" + name + "  number:" + age);
	}

	public static void main(String[] args) {
		ThisSelf ts1 = new ThisSelf();
		ThisSelf ts2 = new ThisSelf("홍길동");
		ThisSelf ts3 = new ThisSelf("김삿갓", 50);
	}

}
