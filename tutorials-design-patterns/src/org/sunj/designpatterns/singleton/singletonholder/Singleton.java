package org.sunj.designpatterns.singleton.singletonholder;

class Singleton {
  private Singleton() {}

  private static class SingletonHolder {
    private static final Singleton INSTANCE = new Singleton();
    static {
      System.out.println(INSTANCE);
    }
  }

  public static Singleton getInstance() {
    return SingletonHolder.INSTANCE;
  }
}
