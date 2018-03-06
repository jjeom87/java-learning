package org.sunj.designpatterns.decorator.framework;

public abstract class Topping implements Cookie {

  Cookie cookie;

  public Topping(Cookie cookie) {
    this.cookie = cookie;
  }

  @Override
  public abstract String getName();

}
