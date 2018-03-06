package org.sunj.designpatterns.adapter.client;

import org.sunj.designpatterns.adapter.framework.ALibAdapter;
import org.sunj.designpatterns.adapter.framework.PhotoEngine;
import org.sunj.designpatterns.adapter.lib.ALib;

public class AdapterClient {

  public static void main(String[] args) {
    PhotoEngine lib = new ALibAdapter(new ALib());
    // lib = new MyLibAdapter(new MyLib());
    String[] photoList = new String[] {"abc.jpg", "def.jpg"};
    lib.printPhotoList(photoList);
    lib.printPhoto("abc.jpg");
    lib.deletePhoto("abc.jpg");
    lib.addPhoto("aaa.jpg");
  }
}
