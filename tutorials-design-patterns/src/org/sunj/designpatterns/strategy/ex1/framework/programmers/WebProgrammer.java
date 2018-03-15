package org.sunj.designpatterns.strategy.ex1.framework.programmers;

import org.sunj.designpatterns.strategy.ex1.framework.skills.ClientSide;
import org.sunj.designpatterns.strategy.ex1.framework.skills.ServerSide;
import org.sunj.designpatterns.strategy.ex1.framework.skills.WebClientSide;
import org.sunj.designpatterns.strategy.ex1.framework.skills.WebServerSide;

public class WebProgrammer extends Programmer {
  
  public WebProgrammer() {
    ClientSide cs = new WebClientSide();
    ServerSide ss = new WebServerSide();
    setClient(cs);
    setServer(ss);
  }
  
  @Override
  public String getAllSkill() {
    return getClientProgramming() + ", " + getServerProgramming();
  }

}
