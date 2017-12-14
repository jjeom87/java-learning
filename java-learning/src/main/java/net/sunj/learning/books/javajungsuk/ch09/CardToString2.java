﻿package net.sunj.learning.books.javajungsuk.ch09;

class CardToString2 {
	public static class Card {
		String kind;
		int number;

		Card() {
			this("SPADE", 1);
		}

		Card(String kind, int number) {
			this.kind = kind;
			this.number = number;
		}

		public String toString() {
			// Card인스턴스의 kind와 number를 문자열로 반환한다.
			return "kind : " + kind + ", number : " + number;
		}
	}

	public static void main(String[] args) {
		Card c = new Card("HEART", 10);
		System.out.println(c.toString());
	}
}