package org.sunj.designpatterns.observer.client;

import org.sunj.designpatterns.observer.framework.Singer;
import org.sunj.designpatterns.observer.framework.SingerFan;

public class ObserverClient {

  public static void main(String[] args) {
    Singer mcJDM = new Singer(); // 가수 탄생

    // 팬 생성
    SingerFan person1 = new SingerFan("일반인1");
    SingerFan person2 = new SingerFan("일반인2");

    // 가수를 보고 팬들이 달라붙음
    mcJDM.addFan(person1);
    mcJDM.addFan(person2);

    mcJDM.speak(); // 가수가 말을 합니다.

    // 팬 한명이 가수를 보기 싫어해서 탈퇴합니다.
    mcJDM.deleteFan(person2);

    // 새로운 팬이 되기로 결심합니다.
    SingerFan person3 = new SingerFan("일반인3");
    mcJDM.addFan(person3);

    mcJDM.speak(); // 가수가 말을 합니다.
  }

}
