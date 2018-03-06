package org.sunj.designpatterns.strategy.framework.programmers;

import org.sunj.designpatterns.strategy.framework.skills.ClientSide;
import org.sunj.designpatterns.strategy.framework.skills.ServerSide;

public abstract class Programmer {
  private ClientSide client;
  private ServerSide server;

  public Programmer() {}

  // 스킬을 세팅 할 수 있도록 getter/setter를 설정합니다.
  public ClientSide getClient() {
    return client;
  }

  public void setClient(ClientSide client) {
    this.client = client;
  }

  public ServerSide getServer() {
    return server;
  }

  public void setServer(ServerSide server) {
    this.server = server;
  }

  // 클라이언트 프로그래밍 스킬을 나열합니다.
  public String getClientProgramming() {
    return client.getClientProgramming();
  }

  // 서버 프로그래밍 스킬을 나열합니다.
  public String getServerProgramming() {
    return server.getServerPrograming();
  }

  // 해당 메소드는 프로그래머가 가진 모든 스킬을 출력해야 합니다.
  public abstract String getAllSkill();
}
