package org.sunj.ch04;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarExam {

  public String hundredDaysAfter() {
    // 오늘부터 100일 뒤의 날짜를 "2016년1월1일"의 형식으로 return하세요.
    Calendar cal = Calendar.getInstance();
    cal.add(Calendar.DATE, 100);
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy년MM월dd일");
    return sdf.format(cal.getTime());
  }

  public static void main(String[] args) {
    CalendarExam exem = new CalendarExam();
    System.out.println(exem.hundredDaysAfter());
  }

}
