package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		
		int num = 34343;
		int rev =0;
		
		for(int i=num;i>0;i=i/10)
		{
			int rem = i%10;
			rev = rev*10+rem;
			
		}
		
		if (num == rev)
		{
			System.out.println("Palindrome");
		}
		else
			System.out.println("Not a Palindrome");

	}

}
