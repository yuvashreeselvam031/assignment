package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=13, temp=0;	
	for (int i = 2; i < a; i++) {
		if(a%i==0)
		{
				temp=temp+1;
		}
		
	}
	if(temp==0) {
		System.out.println("is a prime number");
	}
	else
	{
		System.out.println("not a prime number");
	}
	
	}}
	
	
    
	



