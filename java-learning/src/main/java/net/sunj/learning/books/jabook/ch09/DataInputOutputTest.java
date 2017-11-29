package net.sunj.learning.books.jabook.ch09;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputOutputTest {
	public static void main(String[] args) throws IOException, FileNotFoundException {
		char c = 'A';
		char c1 = 'X';

		String str = "jabook";
		String str1 = "java";
		String file = "DataInputOutputTest.txt";

		DataInputStream in = null;
		DataOutputStream out = null;
		FileOutputStream fout = new FileOutputStream(file);

		out = new DataOutputStream(fout);
		out.writeChar(c);
		out.writeUTF(str);
		out.close();

		FileInputStream fin = new FileInputStream(new File(file));
		in = new DataInputStream(fin);
		System.out.println("c:" + c + " c1:" + c1 + " str:" + str + " str1:" + str1);
		
		c1 = in.readChar();
		str1 = in.readUTF();
		in.close();
		System.out.println("c:" + c + " c1:" + c1 + " str:" + str + " str1:" + str1);
	}
}