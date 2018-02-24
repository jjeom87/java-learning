package org.sunj.jabook.ch03;

public class Test7Main {

	public static void main(String[] args) {
		Test7 hong = new Test7();
		hong.setName("홍길동");
		hong.setTelephone("450-5555");
		hong.setAge(25);
		System.out.println(hong.getName() + hong.getTelephone() + hong.getAge());

		Test7 kim = new Test7();
		kim.setName("김삿갓");
		kim.setTelephone("888-9999");
		kim.setAge(52);
		System.out.println(kim.getName() + kim.getTelephone() + kim.getAge());

		Test7 babo = null;//홍길동의 닉네임
		babo = hong;
		System.out.println(babo.getName() + babo.getTelephone() + babo.getAge());
	}
}