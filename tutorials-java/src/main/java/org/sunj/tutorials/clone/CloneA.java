package org.sunj.tutorials.clone;

import java.util.ArrayList;

public class CloneA implements Cloneable {

  private String name;
  private ArrayList<String> list;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ArrayList<String> getList() {
    return list;
  }

  public void setList(ArrayList<String> list) {
    this.list = list;
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

}
