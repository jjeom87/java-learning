package org.sunj.tutorials.anonymous;

public class AnonymousClassTest {

  public static void main(String[] args) {
    Foo foo = new Foo();

    Foo bar = new Foo() {
      @Override
      public void hello(Bar bar) {
        System.out.println("Bar!!");
        bar.world();
      };
    };

    foo.hello(new Bar() {
      @Override
      public void world() {
        System.out.println("Bar World!! ");
      }
    });
    
    bar.hello(new Bar());
  }

  public static class Foo {
    public void hello(Bar bar) {
      System.out.println("Foo!!");
      bar.world();
    }
  }
  
  public static class Bar {
    public void world() {
      System.out.println("Hello World!");
    }
  }

}
