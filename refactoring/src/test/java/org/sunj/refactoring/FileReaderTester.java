package org.sunj.refactoring;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class FileReaderTester extends TestCase {

  private FileReader _input;

  public FileReaderTester(String name) {
    super(name);
  }

  @Override
  protected void setUp() {
    try {
      _input = new FileReader(this.getClass().getClassLoader().getResource("data.txt").getPath());
    } catch (FileNotFoundException e) {
      throw new RuntimeException("unable to open test file");
    }
  }

  public void testRead() throws IOException {
    char ch = '&';
    for (int i = 0; i < 4; i++) {
      ch = (char) _input.read();
    }
    assertEquals('d', ch);
  }

  @Override
  protected void tearDown() throws Exception {
    try {
      _input.close();
    } catch (IOException e) {
      throw new RuntimeException("error on closing test file");
    }
  }
  
  public static Test suite() {
    TestSuite suite = new TestSuite();
    suite.addTest(new FileReaderTester("testRead"));
    return suite;
  }
  
  public static void main(String[] args) {
    junit.textui.TestRunner.run(suite());
  }

}
