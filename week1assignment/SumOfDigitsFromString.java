package week1.day1;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		String text = "Tes12Le79af65";
		int sum=0;
		char a;
		for (int i = 0; i < text.length(); i++) {
			
		    a= text.charAt(i);
		    
			if (Character.isDigit(a)) {
				
			sum=sum+Character.getNumericValue(a);
			
			}
		}
		System.out.println(sum);

	}

}
