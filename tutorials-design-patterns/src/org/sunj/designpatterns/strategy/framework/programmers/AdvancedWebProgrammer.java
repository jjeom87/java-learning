package org.sunj.designpatterns.strategy.framework.programmers;

import org.sunj.designpatterns.strategy.framework.skills.AdvancedServerSide;
import org.sunj.designpatterns.strategy.framework.skills.AdvancedWebClientSide;

public class AdvancedWebProgrammer extends Programmer {

  public AdvancedWebProgrammer() {
    setClient(new AdvancedWebClientSide());
    setServer(new AdvancedServerSide());
  }
  
  @Override
  public String getAllSkill() {
    return getClientProgramming() + ", " + getServerProgramming();
  }

}
