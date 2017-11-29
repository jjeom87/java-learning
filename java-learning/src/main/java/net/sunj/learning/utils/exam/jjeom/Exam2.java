package net.sunj.learning.utils.exam.jjeom;

public class Exam2 {

	public static void main(String[] args) {
		Exam2 exam2 = new Exam2();
		exam2.findCodon("ACCGGCCGAGACAGCGAGCATATGCCGCCGAGACAGGCCGGACCGGCCGAGA", "GCCG");
	}

	public void findCodon(String acgtSequence, String codon) {
		char[] acgtSequenceCharArray = acgtSequence.toCharArray();
		char[] codonCharArray = codon.toCharArray();
		for (int i = 0, k = 0; i < acgtSequenceCharArray.length - codonCharArray.length; i = i + 1 + k) {
			k = 0;
			if (acgtSequenceCharArray[i] == codonCharArray[0]) {
				char[] charArr = new char[codonCharArray.length];
				System.arraycopy(acgtSequenceCharArray, i, charArr, 0, codonCharArray.length);
				String str = new String(charArr);
				if (codon.equals(str)) {
					System.out.println(i);
					k = codon.length();
				}
			}
		}
	}
}