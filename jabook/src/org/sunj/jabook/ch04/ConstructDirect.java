package org.sunj.jabook.ch04;

public class ConstructDirect {
	private String name = null;
	private String address = null;
	private int age = 0;

	public ConstructDirect(String sname, String saddress, int sage) {
		name = sname;
		address = saddress;
		age = sage;
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
		ConstructDirect ct = new ConstructDirect("홍길동", "서울시 중구", 25);
		String s;
		s = ct.getList();
		System.out.println(s);
	}

}