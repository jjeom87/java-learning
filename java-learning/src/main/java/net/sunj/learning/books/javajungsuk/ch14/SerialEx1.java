package net.sunj.learning.books.javajungsuk.ch14;
import java.io.*;
import java.util.ArrayList;

public class SerialEx1  
{
	public static void main(String[] args) 
	{
		try {
			String fileName = "UserInfo.ser";
			FileOutputStream fos = new FileOutputStream(fileName);
			BufferedOutputStream bos = new BufferedOutputStream(fos);

			ObjectOutputStream out = new ObjectOutputStream(bos);
			
			UserInfo u1 = new UserInfo("JavaMan","1234",30);
			UserInfo u2 = new UserInfo("JavaWoman","4321",26);

			ArrayList list = new ArrayList();
			list.add(u1);
			list.add(u2);

			// 媛泥대? 吏?ы???
			out.writeObject(u1);
			out.writeObject(u2);
			out.writeObject(list);
			out.close();
			System.out.println("吏?ы媛 ? ??ъ듬??");
		} catch(IOException e) {
			e.printStackTrace();
		}
	} // main
} // class
