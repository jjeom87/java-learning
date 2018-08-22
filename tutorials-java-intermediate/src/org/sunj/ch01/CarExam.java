package org.sunj.ch01;

public class CarExam {

  public static void main(String[] args) {
    Car ex = new Car();
    ex.name = "Car";
    ex.number = 1234;
    System.out.println(ex);
  }

  static class Car {
    String name;
    int number;

    @Override
    public String toString() {
      return "name: " + name + ", number: " + number;
    }
  }
}
