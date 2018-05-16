package org.sunj.designpatterns.factory.ex1.fm.framework;

public class SuperRobotFactory extends RobotFactory {

  @Override
  public Robot createRobot(String name) {
    switch (name) {
      case "super":
        return new SuperRobot();
      case "power":
        return new PowerRobot();
    }

    return null;
  }

}
