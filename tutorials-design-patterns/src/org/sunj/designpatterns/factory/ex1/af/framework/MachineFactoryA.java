package org.sunj.designpatterns.factory.ex1.af.framework;

public class MachineFactoryA implements MachineFactory {

  @Override
  public MachineA getMachineA() {
    return new MachineA1();
  }

  @Override
  public MachineB getMachineB() {
    return new MachineB1();
  }

}
