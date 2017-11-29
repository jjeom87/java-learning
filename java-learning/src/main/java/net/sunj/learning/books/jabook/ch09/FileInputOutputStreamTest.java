package net.sunj.learning.books.jabook.ch09;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileInputOutputStreamTest {
	public static void main(String[] args) {
		int i, len = 0;

		InputStream in = null;
		OutputStream out = null;

		/*		
 		if (args.length < 2) {
			System.out.println("원본 파일과 복사될 파일의 이름을 입력하십시요!");
			System.exit(-1);
		}

		System.out.println("원본파일 : " + args[0]);
		System.out.println("목표파일 : " + args[1]);
 		*/
		try {
			in = new FileInputStream(new File("src/jabook/ch09/FileTest.txt"));
			out = new FileOutputStream("src/jabook/ch09/FileTest2.txt", true);
			// FileOutputStream(String name, boolean append)
			// append 는 FileTest2가 이미 존재할 때 내용을 이어서 붙힐 것이냐 아니면 새로 작성할 것이냐
			// 예) FiltTest2가 이미 존재할때 내용이 "file"이면 appeend가 true일때는 "filefile"이 된다.
			// false 일때는 지우고 작성하기때문에 "file"다.
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}

		try {
			while ((i = in.read()) != -1) {
				out.write(i);
				len++;
			}
			in.close();
			out.close();
			System.out.println(len + " bytes are copied...Successfully!");
		} catch (IOException e1) {
			System.out.println(e1);
		}
	}
}