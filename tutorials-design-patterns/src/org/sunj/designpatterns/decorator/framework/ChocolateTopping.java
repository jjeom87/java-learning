package org.sunj.designpatterns.decorator.framework;

public class ChocolateTopping extends Topping {

  public ChocolateTopping(Cookie cookie) {
    super(cookie);
  }

  @Override
  public String getName() {
    return "초콜릿맛 " + cookie.getName();
  }

}
