package org.sunj.designpatterns.adapter.framework;

import org.sunj.designpatterns.adapter.lib.ALib;

public class ALibAdapter implements PhotoEngine {

  ALib lib;

  public ALibAdapter(ALib lib) {
    this.lib = lib;
  }

  public void printPhoto(String fileName) {
    lib.printPhoto(fileName);
  }

  public void printPhotoList(String[] listName) {
    for (int i = 0; i < listName.length; i++) {
      lib.printPhoto(listName[i]);
    }
  }

  public void deletePhoto(String fileName) {
    lib.deletePhoto(fileName);
  }

  public void addPhoto(String fileName) {
    lib.addPhoto(fileName);
  }

}
