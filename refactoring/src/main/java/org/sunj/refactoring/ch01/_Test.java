package org.sunj.refactoring.ch01;

import org.junit.Test;

public class _Test {

  @Test
  public void test() {
    Customer customer = new Customer("엄정재");
    customer.addRental(new Rental(new Movie("광해", Movie.NEW_RELEASE), 7));
    customer.addRental(new Rental(new Movie("신데렐라", Movie.CHILDRENS), 5));
    String result = customer.statement();
    System.out.println(result);
  }

}
