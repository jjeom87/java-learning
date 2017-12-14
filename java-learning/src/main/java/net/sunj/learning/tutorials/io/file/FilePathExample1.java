package net.sunj.learning.tutorials.io.file;

import java.io.File;
import java.io.IOException;

public class FilePathExample1 {
	public static void main(String[] args) {
		try {

			String filename = "newFile.txt";
			String workingDirectory = System.getProperty("user.dir");
			
			System.out.println("user.dir : " + workingDirectory);
			
			String absoluteFilePath = "";

			// absoluteFilePath = workingDirectory +
			// System.getProperty("file.separator") + filename;
			absoluteFilePath = workingDirectory + File.separator + filename;

			System.out.println("Final filepath : " + absoluteFilePath);

			File file = new File(absoluteFilePath);
			System.out.println("getParent : " + file.getParent());
			
			
			if (file.createNewFile()) {
				System.out.println("File is created!");
			} else {
				System.out.println("File is already existed!");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
