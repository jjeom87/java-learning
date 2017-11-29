package net.sunj.learning.books.jabook.ch05;

import java.util.Vector;

public class UpDownCasting {
	public static void main(String[] args) {
		String name = new String("홍길동");
		Integer id = new Integer(1000);
		Vector v = new Vector();
		v.addElement(name);
		v.addElement(id);

		Object obj1 = v.elementAt(0);
		Object obj2 = v.elementAt(1);
		
		String str = (String) obj1;
		Integer num = (Integer) obj2;
		System.out.println("이름:" + str + "  번호:" + num);
		
		String str2 = (String) v.elementAt(0);
		Integer num2 = (Integer) v.elementAt(1);
		System.out.println("이름:" + str2 + "  번호:" + num2);
	}

}