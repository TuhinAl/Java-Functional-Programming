package basic;

import java.util.Stack;

public class IntegerPalindrome {
	public static String palindrome(Integer number) {
		if(number < 0 || (number != 0 && number % 10 == 0)) {
			return " Is a Palindrome Number";
		}
		
		int reverseNumber = 0;
		while(number > reverseNumber) {
			int pop  = number % 10 ;
			reverseNumber = (reverseNumber * 10) + pop;
			number = number /10;
		}
		if( number == reverseNumber ) {
			return " Is a Palindrome Number";
		}
		
		return "Is not a palindrome Number";
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(IntegerPalindrome.palindrome(5665));

	}

}
