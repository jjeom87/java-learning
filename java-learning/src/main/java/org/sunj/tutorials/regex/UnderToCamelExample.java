package org.sunj.tutorials.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UnderToCamelExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		underCoreToCamelTest();

	}
	
	public static void underCoreToCamelTest() throws Exception {
		List<String> list = new ArrayList<String>();
		list.add("pr_no");
		list.add("ttl");
		list.add("pr_typecd");
		list.add("tax_typecd");
		list.add("io_flag");
		list.add("gm_chrgr_cd");
		list.add("pr_chrgr_cd");
		list.add("gr_chrgr_cd");
		list.add("chk_chrgr_cd");
		list.add("dlv_fr_ymd");
		list.add("dlv_to_ymd");
		list.add("req_usr_nm");
		list.add("req_usr_tel");
		list.add("pr_rmrk");
		list.add("dlv_loc");
		list.add("dlv_req_ymd");
		list.add("spot_dscr_yn");
		list.add("spot_dscr_dt");
		list.add("spot_dscr_usrnm");
		list.add("spot_dscr_usrtel");
		list.add("spot_dscr_loc");
		list.add("prebid_yn");
		
		for (final String str : list) {
			System.out.println("private String " + underCoreToCamel(str) + ";");
		}
	}
	
	private static String underCoreToCamel(String text) {
		Matcher m = Pattern.compile("_[a-z]").matcher(text);

		StringBuffer sb = new StringBuffer();
		while (m.find()) {
			m.appendReplacement(sb, m.group().toUpperCase().replaceAll("_", ""));
		}
		m.appendTail(sb);

		return sb.toString();
	}

}
