package org.sunj.tutorials.clone;

import java.util.ArrayList;

public class CloneClient {

  public static void main(String[] args) throws CloneNotSupportedException {
    ArrayList<String> listA = new ArrayList<String>();
    listA.add("list-sunj");
    
    CloneA cloneA = new CloneA();
    cloneA.setName("sunj");
    cloneA.setList(listA);

    CloneA cloneAA = (CloneA) cloneA.clone();
    System.out.println("cloneA name : " + cloneA.getName());
    System.out.println("cloneAA name : " + cloneAA.getName());
    System.out.println("cloneA list : " + cloneA.getList());
    System.out.println("cloneAA list : " + cloneAA.getList());
    
    cloneA.setName("jjeom87");
    listA.add("list-jjeom87");
    cloneA.setList(listA);
    System.out.println("cloneA name : " + cloneA.getName());
    System.out.println("cloneAA name : " + cloneAA.getName());
    System.out.println("cloneA list : " + cloneA.getList());
    System.out.println("cloneAA list : " + cloneAA.getList());

    
    ArrayList<String> listB = new ArrayList<String>();
    listB.add("list-sunj");
    
    CloneB cloneB = new CloneB();
    cloneB.setName("sunj");
    cloneB.setList(listB);

    CloneB cloneBB = (CloneB) cloneB.clone();
    System.out.println("cloneB name : " + cloneB.getName());
    System.out.println("cloneBB name : " + cloneBB.getName());
    System.out.println("cloneB list : " + cloneB.getList());
    System.out.println("cloneBB list : " + cloneBB.getList());
    
    cloneB.setName("jjeom87");
    listB.add("list-jjeom87");
    cloneB.setList(listB);
    System.out.println("cloneB name : " + cloneB.getName());
    System.out.println("cloneBB name : " + cloneBB.getName());
    System.out.println("cloneB list : " + cloneB.getList());
    System.out.println("cloneBB list : " + cloneBB.getList());
  }

}
