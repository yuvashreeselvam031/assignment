package week1.day1;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String test = "changeme";
       char[] test1=test.toCharArray();
       for (int i = 0; i < test1.length; i++) {
    	   
		if (i%2==0) {
			System.out.println(test1[i]);
		}
		else
		{
			char x = test1[i];
			char y = Character.toUpperCase(x);
			System.out.println(y);
		}
	}
     
	}

}
