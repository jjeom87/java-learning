package net.sunj.learning.tutorials.mkyoung.io.file;

import java.io.File;
import java.io.IOException;

public class FilePermissionExample {

	public static void main(String[] args) {
		try {

			String workingDir = System.getProperty("user.dir");
			File file = new File(workingDir, "newfile.txt");
			if (file.createNewFile()) {
				System.out.println("File is created!");
			} else {
				System.out.println("File already exists.");
			}

			if (file.exists()) {
				System.out.println("Is Execute allow : " + file.canExecute());
				System.out.println("Is Write allow : " + file.canWrite());
				System.out.println("Is Read allow : " + file.canRead());
			}

			file.setExecutable(false);
			file.setReadable(false);
			file.setWritable(false);

			System.out.println("Is Execute allow : " + file.canExecute());
			System.out.println("Is Write allow : " + file.canWrite());
			System.out.println("Is Read allow : " + file.canRead());

			if (file.createNewFile()) {
				System.out.println("File is created!");
			} else {
				System.out.println("File already exists.");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
