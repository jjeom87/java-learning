package org.sunj.designpatterns.adapter.framework;

import org.sunj.designpatterns.adapter.lib.MyLib;

public class MyLibAdapter implements PhotoEngine {

  MyLib lib;

  public MyLibAdapter(MyLib lib) {
    this.lib = lib;
  }

  public void printPhoto(String fileName) {
    lib.printPhoto(fileName);
  }

  public void printPhotoList(String[] listName) {
    lib.printPhotoList(listName);
  }

  public void deletePhoto(String fileName) {
    lib.deletePhoto(fileName);
  }

  public void addPhoto(String fileName) {
    lib.addPhoto(fileName);
  }

}
