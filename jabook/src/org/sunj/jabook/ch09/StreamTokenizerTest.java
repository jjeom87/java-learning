package org.sunj.jabook.ch09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class StreamTokenizerTest {

	public static void main(String[] args) throws IOException {
		String cusName = "안녕하쇼!!";
		String name1 = cusName;
		String name2 = "";
		if (cusName.length() > 3) {
			name1 = cusName.substring(0, 3);
			name2 = cusName.substring(3);
		}
		System.out.println("name1 : " + name1);
		System.out.println("name2 : " + name2);
		
		InputStreamReader reader = new InputStreamReader(new FileInputStream("src/jabook/ch09/StreamTonkenizerTest.txt"));
		StreamTokenizer tokens = new StreamTokenizer(reader);
		tokens.quoteChar('"');

		while (tokens.nextToken() != tokens.TT_EOF) {
			switch (tokens.ttype) {
			case '"':
				System.out.println("1");
				System.out.println(tokens.sval);
				break;
			case StreamTokenizer.TT_WORD:
				System.out.println("2");
				System.out.println(tokens.sval);
				break;
			case StreamTokenizer.TT_NUMBER:
				System.out.println("3");
				System.out.println(tokens.nval);
				break;
			}
		}
	}
}