package org.sunj.tutorials.io.file;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Scanner;
import org.apache.commons.io.IOUtils;

public class ReadFileFromClassPath {
  public static void main(String[] args) {
    File file1 = new File(ReadFileFromClassPath.class.getResource("/files/test.txt").getFile());
    System.out.println("is file file1 : " + file1.isFile());

    File file2 = new File(
        ReadFileFromClassPath.class.getClassLoader().getResource("files/test.txt").getFile());
    System.out.println("is file file2 : " + file2.isFile());

    InputStream stream =
        ReadFileFromClassPath.class.getClassLoader().getResourceAsStream("files/test.txt");
    System.out.println(stream != null);

    ReadFileFromClassPath obj = new ReadFileFromClassPath();
    System.out.println(obj.getFile("files/test.txt"));
    System.out.println(obj.getFileWithUtil("files/test.txt"));
  }

  private String getFile(String fileName) {
    StringBuilder result = new StringBuilder("");

    // Get file from resources folder
    ClassLoader classLoader = getClass().getClassLoader();
    File file = new File(classLoader.getResource(fileName).getFile());

    try (Scanner scanner = new Scanner(file)) {

      while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        result.append(line).append("\n");
      }

      scanner.close();

    } catch (IOException e) {
      e.printStackTrace();
    }

    return result.toString();
  }

  private String getFileWithUtil(String fileName) {
    String result = "";

    ClassLoader classLoader = getClass().getClassLoader();
    try {
      result = IOUtils.toString(classLoader.getResourceAsStream(fileName), Charset.forName("UTF-8"));
    } catch (IOException e) {
      e.printStackTrace();
    }

    return result;
  }
}
