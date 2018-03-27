package org.sunj.tutorials.string;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import sun.awt.CharsetString;

public class CamelToUnderScore {
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    String text = "aaa";
    Matcher m1 = Pattern.compile("(?=[a])").matcher(text);
    Matcher m2 = Pattern.compile("(?![a])").matcher(text);
    Matcher m3 = Pattern.compile("(?<=[a])").matcher(text);
    Matcher m4 = Pattern.compile("(?<![a])").matcher(text);
    Matcher m5 = Pattern.compile("(?>[a])").matcher(text);

    System.out.println("m1 : " + m1.replaceAll("B"));
    System.out.println("m2 : " + m2.replaceAll("B"));
    System.out.println("m3 : " + m3.replaceAll("B"));
    System.out.println("m4 : " + m4.replaceAll("B"));
    System.out.println("m5 : " + m5.replaceAll("B"));

    camelToUnderCore("Hi How areYouToday");
    underCoreToCamel("Hi How are_you_today");

    List<String> list = new ArrayList<>();
    list.add("file_no");
    list.add("cli_filenm");
    list.add("svr_filenm");
    list.add("file_dir");
    list.add("file_sz");
    list.add("reg_dt");
    list.add("reg_usrcd");
    list.add("file_rmrk");
    list.add("use_yn");
    list.add("file_type");

    for (final String str : list) {
      underCoreToCamel(str);
    }

    try {
      System.out.println("พ฿".getBytes("EUC-KR").length);
      System.out.println("วั".getBytes().length);
    } catch (UnsupportedEncodingException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    String[] str = new String[] {"msg_ref_no"
        ,"msg_seq"
        ,"msg_type"
        ,"msg_ref_type"
        ,"msg_ttl"
        ,"msg_cntn"
        ,"sender"
        ,"sender_type"
        ,"send_org_cd"
        ,"send_cus_cd"
        ,"send_user_cd"
        ,"receiver"
        ,"rcv_cus_cd"
        ,"rcv_user_nm"
        ,"send_status"
        ,"send_rslt_msg"
        ,"reg_dt"};
    
    for (String string : str) {
      underCoreToCamel(string);
    }


  }

  public static void camelToUnderCore(String text) {
    Matcher m = Pattern.compile("(?<=[a-z])[A-Z]").matcher(text);

    StringBuffer sb = new StringBuffer();
    while (m.find()) {
      m.appendReplacement(sb, "_" + m.group().toLowerCase());
    }
    m.appendTail(sb);

    System.out.println(sb.toString());
  }

  public static void underCoreToCamel(String text) {
    Matcher m = Pattern.compile("_[a-z]").matcher(text);

    StringBuffer sb = new StringBuffer();
    while (m.find()) {
      m.appendReplacement(sb, m.group().toUpperCase().replaceAll("_", ""));
    }
    m.appendTail(sb);

    System.out.println(sb.toString());
  }
}
