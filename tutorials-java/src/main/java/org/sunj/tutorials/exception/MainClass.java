package org.sunj.tutorials.exception;

public class MainClass {
  public static void main(String[] args) throws Exception {
    MainClass mainClass = new MainClass();

    System.out.println(
        "============================== getLeaveWithoutChaining START ==============================");
    try {
      mainClass.getLeaveWithoutChaining();
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println(
        "============================== getLeaveWithoutChaining END   ==============================");

    System.out.println(
        "============================== getLeaveWithChaining START ==============================");
    try {
      mainClass.getLeaveWithChaining();
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println(
        "============================== getLeaveWithChaining END   ==============================");
  }

  void howIsTeamLead() throws TeamLeadUpsetException {
    throw new TeamLeadUpsetException("Team Lead Upset");
  }

  void getLeaveWithoutChaining() throws NoLeaveGrantedException {
    try {
      howIsTeamLead();
    } catch (TeamLeadUpsetException e) {
      throw new NoLeaveGrantedException("Leave not sanctioned.");
    }
  }

  void getLeaveWithChaining() throws NoLeaveGrantedException {
    try {
      howIsTeamLead();
    } catch (TeamLeadUpsetException e) {
      throw new NoLeaveGrantedException("Leave not sanctioned.", e);
    }
  }
}


class NoLeaveGrantedException extends Exception {

  public NoLeaveGrantedException(String message, Throwable cause) {
    super(message, cause);
  }

  public NoLeaveGrantedException(String message) {
    super(message);
  }
}


class TeamLeadUpsetException extends Exception {
  // Both Constructors
  public TeamLeadUpsetException(String message, Throwable cause) {
    super(message, cause);
  }

  public TeamLeadUpsetException(String message) {
    super(message);
  }
}
