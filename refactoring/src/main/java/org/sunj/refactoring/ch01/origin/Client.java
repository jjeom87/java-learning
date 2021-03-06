package org.sunj.refactoring.ch01.origin;

import org.junit.Test;

public class Client {

  @Test
  public void rentalTest() {
    Customer customer = new Customer("엄정재");
    customer.addRental(new Rental(new Movie("광해", Movie.NEW_RELEASE), 07));
    customer.addRental(new Rental(new Movie("신데렐라", Movie.CHILDRENS), 5));
    String result = customer.statement();
    System.out.println(result);
  }

}
