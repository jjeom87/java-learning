package org.sunj.designpatterns.adapter.lib;

public class ALib {
  public void printPhoto(String fileName) {
    System.out.println("printPhoto : " + fileName);
  }

  public void deletePhoto(String fileName) {
    System.out.println("deletePhoto : " + fileName);
  }

  public void addPhoto(String fileName) {
    System.out.println("addPhoto : " + fileName);
  }
}
