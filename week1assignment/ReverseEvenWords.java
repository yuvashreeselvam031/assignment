package week1.day1;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String str = "I am a Software Tester";
		String[] words = str.split(" ");
		for (int i = 0; i < words.length; i++) {
			if (i%2==1) {
				char[] s = words[i].toCharArray();
				
				for (int j = s.length -1; j >=0; j--) {
					System.out.print(s[j]);
				}
				System.out.print(" ");
			}
			else
			{
				System.out.print(words[i]+ " ");
			}
			
			
		}

	}

}
