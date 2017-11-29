package net.sunj.learning.utils.exam.jch;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exam2 {
	
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);

		System.out.println("[ ACGT 입력 샘플 ] ");
		String acgtTxt = s.nextLine();

		System.out.println("[ codon 입력 샘플 ] ");
		String codonTxt = s.nextLine();

		Pattern p = Pattern.compile(codonTxt);
		Matcher m = p.matcher(acgtTxt);

		if(acgtTxt.matches(".*"+codonTxt+".*")){
			System.out.println("있네요");
		}

		boolean a = false;
		while(a = m.find()){
			System.out.println(m.start());
		}
	}
}