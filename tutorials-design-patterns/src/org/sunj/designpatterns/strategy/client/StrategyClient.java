package org.sunj.designpatterns.strategy.client;

import org.sunj.designpatterns.strategy.framework.programmers.AdvancedWebProgrammer;
import org.sunj.designpatterns.strategy.framework.programmers.AmateurProgrammer;
import org.sunj.designpatterns.strategy.framework.programmers.Programmer;
import org.sunj.designpatterns.strategy.framework.programmers.WebProgrammer;
import org.sunj.designpatterns.strategy.framework.skills.AdvancedServerSide;
import org.sunj.designpatterns.strategy.framework.skills.WebClientSide;

public class StrategyClient {

  public static void main(String[] args) {
    Programmer wp = new WebProgrammer();
    Programmer awp = new AdvancedWebProgrammer();
    Programmer ap = new AmateurProgrammer();

    Programmer p = new Programmer() {
      @Override
      public String getAllSkill() {
        return getClientProgramming() + ", " + getServerProgramming();
      }
    };

    p.setClient(new WebClientSide());
    p.setServer(new AdvancedServerSide());

    System.out.println("[WebProgrammer]\n" + wp.getAllSkill());
    System.out.println("[AdvancedWebProgrammer]\n" + awp.getAllSkill());
    System.out.println("[AmateurProgrammer]\n" + ap.getAllSkill());
    System.out.println("[DynamicProgrammer]\n" + p.getAllSkill());
  }
}
