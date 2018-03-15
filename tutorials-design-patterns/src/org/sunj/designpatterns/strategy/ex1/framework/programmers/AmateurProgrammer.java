package org.sunj.designpatterns.strategy.ex1.framework.programmers;

import org.sunj.designpatterns.strategy.ex1.framework.skills.AdvancedWebClientSide;
import org.sunj.designpatterns.strategy.ex1.framework.skills.WebServerSide;

public class AmateurProgrammer extends Programmer {

  public AmateurProgrammer() {
    setClient(new AdvancedWebClientSide());
    setServer(new WebServerSide());
  }
  
  @Override
  public String getAllSkill() {
    return getClientProgramming() + ", " + getServerProgramming();
  }

}
