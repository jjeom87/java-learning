package org.sunj.jabook.ch10;

import java.util.Vector;

public class LCopy2 {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.addElement(new Integer(11));
		v.addElement(new String("원본의 글"));
		
		Vector s = (Vector) v.clone();
		s.addElement(new String("복사본에 추가"));
		System.out.println(v);
		System.out.println(s);
	}
}