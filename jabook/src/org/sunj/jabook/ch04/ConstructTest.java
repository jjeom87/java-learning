package org.sunj.jabook.ch04;

public class ConstructTest {
	private String name = null;
	private String address = null;
	private int age = 0;

	public ConstructTest() {
		name = "이름없음";
		address = "주소없음";
		age = 0;
	}

	public void setList(String sname, String saddress, int sage) {
		name = sname;
		address = saddress;
		age = sage;
	}

	public String getList() {
		String str = name + "  " + address + "   " + age;
		return str;
	}

	public static void main(String[] args) {
		ConstructTest ct = new ConstructTest();
		String s;
		s = ct.getList();
		System.out.println(s);

		ct.setList("홍길동", "서울시 중구", 25);
		s = ct.getList();
		System.out.println(s);
	}
}
