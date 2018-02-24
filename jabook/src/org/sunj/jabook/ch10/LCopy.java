package org.sunj.jabook.ch10;

class SimpleClone implements Cloneable {
	public int count = 0;

	public SimpleClone(int count) {
		this.count = count;
	}

	public Object clone() {
		Object o = null;
		try {
			o = super.clone();
		} catch (Exception e) {
			System.out.println("can't clone object");
		}
		return o;
	}
}

public class LCopy {

	public static void main(String[] args) {
		SimpleClone sc1 = new SimpleClone(22);
		SimpleClone sc2 = (SimpleClone) sc1.clone();

		System.out.println("sc1 hashCode : " + sc1.hashCode() + ", count의값 : " + sc1.count);
		System.out.println("sc2 hashCode : " + sc2.hashCode() + ", count의값 : " + sc2.count);
	}
}