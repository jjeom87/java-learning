package org.sunj.designpatterns.factory.ex1.af.client;

import org.sunj.designpatterns.factory.ex1.af.framework.MachineFactory;
import org.sunj.designpatterns.factory.ex1.af.framework.MachineFactoryA;
import org.sunj.designpatterns.factory.ex1.af.framework.MachineFactoryB;

public class MachineFactoryClient {

  public static void main(String[] args) {
    MachineFactory machineFactoryA = new MachineFactoryA();
    machineFactoryA.getMachineA().process();
    machineFactoryA.getMachineB().process();

    MachineFactory machineFactoryB = new MachineFactoryB();
    machineFactoryB.getMachineA().process();
    machineFactoryB.getMachineB().process();
  }

}
