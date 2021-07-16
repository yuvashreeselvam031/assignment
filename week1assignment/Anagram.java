package week1.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String a="stops";
		String b="potss";
		boolean status= false;
		if (a.length()==b.length()) {
			char[] a1= a.toCharArray();
			char[] b1= b.toCharArray();
			Arrays.sort(a1);
			Arrays.sort(b1);
			status=Arrays.equals(a1,b1);
		
		}
		if (status) {
			System.out.println("anagram");
		} else {
			System.out.println("not a anagram");

		}

	}

}
