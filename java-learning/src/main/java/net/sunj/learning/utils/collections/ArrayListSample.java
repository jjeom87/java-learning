package net.sunj.learning.utils.collections;

import java.util.ArrayList;

public class ArrayListSample {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		
		System.out.println(list.size());
		String str = (String) list.remove(0);
		System.out.println(str);
		System.out.println(list.size());
		str = (String) list.get(0);
		System.out.println(str);
	}

}
