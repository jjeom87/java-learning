package org.sunj.designpatterns.decorator.client;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import org.sunj.designpatterns.decorator.framework.BraveCookie;
import org.sunj.designpatterns.decorator.framework.ChocolateTopping;
import org.sunj.designpatterns.decorator.framework.Cookie;
import org.sunj.designpatterns.decorator.framework.MilkTopping;

public class DecoratorClient {

  public static void main(String[] args) throws FileNotFoundException {
    Cookie braveCookie = new BraveCookie();
    Cookie milkBraveCookie = new MilkTopping(braveCookie);
    Cookie chocolateMilkBraveCookie = new ChocolateTopping(milkBraveCookie);
    Cookie chocolateDoubleMilkBraveCookie = new MilkTopping(chocolateMilkBraveCookie);
    
    System.out.println("braveCookie : " + braveCookie.getName());
    System.out.println("milkBraveCookie : " + milkBraveCookie.getName());
    System.out.println("chocolateMilkBraveCookie : " + chocolateMilkBraveCookie.getName());
    System.out.println("chocolateDoubleMilkBraveCookie : " + chocolateDoubleMilkBraveCookie.getName());
        
 // 소다 쿠키 만들기
    Cookie SodaCookie = new Cookie() {
        @Override
        public String getName() {
            return "소다 쿠키";
        }
    };
    
    System.out.println("SodaCookie : " + SodaCookie.getName());

    // 초콜릿을 두번 넣은 소다 쿠키 만들기
    SodaCookie = new ChocolateTopping(new ChocolateTopping(SodaCookie));
    System.out.println("SodaCookie : " + SodaCookie.getName());
    
    /* read file example */
    BufferedReader br = new BufferedReader(new FileReader(new File("test.txt")));
  }

}
