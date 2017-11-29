package net.sunj.learning.books.jabook.ch06;

import java.util.Vector;

public class VectorTest2 {
	public static void main(String[] args) {
		Vector v = new Vector();

		//벡터객체에 데이터 삽입 
		v.addElement(new Character('A'));
		v.addElement(new String("굼뱅이"));
		v.addElement(new Integer(100));
		v.addElement(new Integer(200));
		v.insertElementAt(new Float(3.141592), 1); //1번째에 중간삽입
		v.setElementAt(new String("Set"), 3); //3번째존재하는 것 제거후 다시 삽입(update)

		System.out.println("size: " + v.size());
		System.out.println("벡터의0번째:" + (Character) v.elementAt(0));
		System.out.println("벡터의1번째:" + (Float) v.elementAt(1));
		System.out.println("벡터의2번째:" + (String) v.elementAt(2));
		System.out.println("벡터의3번째:" + (String) v.elementAt(3));
		System.out.println("벡터의4번째:" + ((Integer) v.elementAt(4)).toString());

		if (v.contains(new String("Set"))) {
			Integer integer = new Integer(v.indexOf("Set"));
			System.out.println("Index of String(\"Set\"): " + integer.toString());
		}
	}
}