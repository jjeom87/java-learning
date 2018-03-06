package org.sunj.designpatterns.observer.framework;

public interface Talent {
  void addFan(Fan o);

  void deleteFan(Fan o);

  void speak();
}
