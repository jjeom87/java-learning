package org.sunj.designpatterns.factory.ex1.fm.client;

import org.sunj.designpatterns.factory.ex1.fm.framework.ModifiedSuperRobotFactory;
import org.sunj.designpatterns.factory.ex1.fm.framework.Robot;
import org.sunj.designpatterns.factory.ex1.fm.framework.RobotFactory;
import org.sunj.designpatterns.factory.ex1.fm.framework.SuperRobotFactory;

public class RobotFactoryClient {

  public static void main(String[] args) {
    RobotFactory rf = new SuperRobotFactory();
    Robot r = rf.createRobot("super");
    Robot r2 = rf.createRobot("power");

    System.out.println(r.getName());
    System.out.println(r2.getName());

    RobotFactory mrf = new ModifiedSuperRobotFactory();
    Robot r3 = mrf.createRobot("org.sunj.designpatterns.factory.method.ex1.framework.SuperRobot");
    Robot r4 = mrf.createRobot("org.sunj.designpatterns.factory.method.ex1.framework.PowerRobot");

    System.out.println(r3.getName());
    System.out.println(r4.getName());
  }

}
