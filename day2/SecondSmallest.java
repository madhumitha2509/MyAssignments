package week1.day2;

import java.util.Arrays;

public class SecondSmallest {

	public static void main(String[] args) {
		
		int [] num = {23,45,67,32,89,22 };
		
		int len = num.length;
		
		Arrays.sort(num);
		
		System.out.print("Second smalles element is " +num[1]);

	}

}
