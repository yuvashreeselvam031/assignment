package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1=0, num2 = 1, num3, count=8;
System.out.println(num1+ "\n" + num2);

for (int i = 2; i <= count; ++i) {
	num3=num1+num2;
	System.out.println(num3);
	
	num1=num2;
	num2=num3;
	
}


	}

}
