package org.sunj.jabook.ch09;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Vector;

public class SequenceInputTest02 {

	public static void main(String[] args) throws IOException {
		int bn = 0;
		FileInputStream fi1 = new FileInputStream("src/jabook/ch09/sequence01.txt");
		FileInputStream fi2 = new FileInputStream("src/jabook/ch09/sequence02.txt");
		FileInputStream fi3 = new FileInputStream("src/jabook/ch09/sequence03.txt");

		Vector v = new Vector();
		v.addElement(fi1);
		v.addElement(fi2);
		v.addElement(fi3);

		SequenceInputStream si = new SequenceInputStream(v.elements());
		while ((bn = si.read()) != -1) {
			System.out.write(bn);
		}
		System.out.flush();
	}
}