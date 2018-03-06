package org.sunj.designpatterns.adapter.framework;

public interface PhotoEngine {
  public void printPhoto(String fileName);

  public void printPhotoList(String[] listName);

  public void deletePhoto(String fileName);

  public void addPhoto(String fileName);
}
