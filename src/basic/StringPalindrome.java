package basic;

public class StringPalindrome {
	
	public static String palindrome(String input) {
		
		if(input.isEmpty() || input == null) {
			return null;
		}
		String palindrome = "";
		for (int i = input.length()-1  ; i >= 0 ; i--) {
			palindrome = palindrome.concat(Character.toString(input.charAt(i)));
		}
		
		return palindrome;
	}

	public static void main(String[] args) {
		System.out.println(StringPalindrome.palindrome("Tuhin"));

	}

}
