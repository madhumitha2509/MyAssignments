package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int n=8, firstNum = 0, secNum = 1;
		System.out.println("Fibonacci Series are");
		
		for(int i=1; i<=n; ++i)
		{
			System.err.println( firstNum+ " ");
			
			int sum = firstNum + secNum;
		    firstNum = secNum;
		    secNum = sum;
		}
	}

}
