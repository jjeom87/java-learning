﻿package org.sunj.jabook.ch11;

import java.awt.Point;
import java.lang.reflect.Field;

public class SettingField {
	
	public static void main(String[] arg) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
		Class c = Class.forName("java.awt.Point");
		Field f = c.getField("x");
		Point p = new Point(100, 200);
		f.set(p, new Integer(50));
		System.out.println(p.toString());
	}
}
