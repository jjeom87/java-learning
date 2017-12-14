package net.sunj.learning.tutorials.string;

public class SplitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "30065|세종특별자치시|Sejong-si|||||361103258091|라온로|Raon-ro|0|7  |0|3611010500107550010000001|||3611010500|가람동|||0|755|01|10||";
		String str2= "30065|세종특별자치시|Sejong-si|||||361103258091|라온로|Raon-ro|0|121|0|3611010500105120002000009|||3611010500|가람동|||0|641|01|0 |339001|011";
		String[] arr = str.split( "\\|" );
		String[] arr2 = str2.split( "\\|" );
		System.out.println("arr : " + arr.length);
		System.out.println("arr2 : " + arr2.length);
	}
}