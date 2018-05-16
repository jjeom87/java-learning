package org.sunj.tutorials.generic.ex3;

public class ProductExam {

  public static void main(String[] args) {
    Product<Tv, String> tvProduct = new Product<Tv, String>();
    tvProduct.setKind(new Tv());
    tvProduct.setModel("스마트 TV");
    Tv tv = tvProduct.getKind();
    String tvModel = tvProduct.getModel();

    System.out.println(tv.getClass().getName() + ":" + tvModel);

    Product<Car, String> carProduct = new Product<Car, String>();
    carProduct.setKind(new Car());
    carProduct.setModel("Das Auto");
    Car car = carProduct.getKind();
    String carModel = carProduct.getModel();

    System.out.println(car.getClass().getName() + ":" + carModel);

  }

}
