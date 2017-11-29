package net.sunj.learning.tutorials.sunj.io.file;

import java.io.InputStream;

public class FileResourceByClassPath {
	public static void main(String[] args) {
		System.out.println(FileResourceByClassPath.class.getResource("").getPath());
		System.out.println(FileResourceByClassPath.class.getClassLoader().getResource("").getPath());
		InputStream stream = FileResourceByClassPath.class.getResourceAsStream("/test.txt");
		System.out.println(stream != null);
		stream = FileResourceByClassPath.class.getClassLoader().getResourceAsStream("test.txt");
		System.out.println(stream != null);
	}
}
