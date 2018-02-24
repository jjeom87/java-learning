package org.sunj.tutorials.exam.hod;

import java.util.*;

public class Test {
	public static void main(String[] args) {
		drawTriAngle(3);
		drawTriAngle(6);

		if (true) {//문제3번 테스트
			int x = 2;
			int find = findNumber(x);
			log("find-val(n)=" + find);
		}
	}

	//문제1 주어진 라인수로 삼각형 그리기 [;
	public static void drawTriAngle(int x) {
		if (x < 2) return;

		log("=====Draw TriAngle======");
		log("line count=" + x);
		String g = "0123456789";

		int lb_cnt = (2 * x - ((2 * x + 1) % 2));
		int cp = (int) Math.ceil(lb_cnt / 2);

		char[] xbuf = new char[lb_cnt];
		int gp = 0;
		int left = cp;
		int right = cp;

		for (int i = 1; i <= x; i++) {
			initChar(xbuf, ' ');
			if (i == 1) {
				xbuf[cp] = g.charAt(((gp++) % g.length()));
			} else if (i == x) {
				for (int j = 0; j < xbuf.length; j++)
					xbuf[j] = g.charAt(((gp++) % g.length()));
			} else {
				xbuf[--left] = g.charAt(((gp++) % g.length()));
				xbuf[++right] = g.charAt(((gp++) % g.length()));

			}
			log("!" + new String(xbuf) + "!");
		}

	}

	//문제2: 주어진 문자열내 특정문자열 위치잦기(전체)

	public static void search(String inputText, String findText) {
		log("=====Find Text=========");
		log("input-text=" + inputText);
		log("find-text=" + findText);

	}

	//문제3: 가장 작은 정수 찾기 (*1*2*3*4...*n=x
	public static int findNumber(int x) {
		log("=====Find  n-value on (*1*2*3...*n=x)======");
		log("input sum-val(x)=" + x);

		ArrayList fifo = new ArrayList();
		fifo.add(new Object[] { new Integer(0), new Integer(0) });

		for (int i = 1; i < 1000; i++) {
			while (fifo.size() > 0) {
				Object[] o = (Object[]) fifo.get(0);
				int x_t = ((Integer) o[0]).intValue();
				int x_n = ((Integer) o[1]).intValue();
				if (x_n >= i) break;

				o = (Object[]) fifo.remove(0);
				System.out.println(x_t + ":" + x_n);
				if (x_t == x) {
					return x_n;
				}

				fifo.add(new Object[] { new Integer(x_t - i), new Integer(i) });
				fifo.add(new Object[] { new Integer(x_t + i), new Integer(i) });

			}
		}
		log("not founc");
		return -1;
	}

	private static void initChar(char[] arr, char c) {
		for (int i = 0; i < arr.length; i++)
			arr[i] = c;
	}

	private static void log(String msg) {
		System.out.println(msg);
	}

}