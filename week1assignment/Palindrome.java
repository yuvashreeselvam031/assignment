package week1.day1;

import java.util.Iterator;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String a ="madam";
		String b ="";
		int s = a.length();
		System.out.println(a);
		
		for ( int i=s-1; i>=0; i--) {
			
			b=b+a.charAt(i);
			
		}
		
		if (a.equals(b)) {
			System.out.println("The string is a palindrome");
		} else {
			System.out.println("The string is not a palindrome");

		}
	}

}
