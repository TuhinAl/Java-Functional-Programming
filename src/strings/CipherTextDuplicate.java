package strings;

import java.util.Stack;

public class CipherTextDuplicate {
	  static String decode(String str) {
	        Stack<Character> stack = new Stack<>();
	        stack.push(str.charAt(0));;
	        for (int i = 1; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            if (stack.peek() == ch && str.charAt(i-1) != '@') {
	                stack.pop();
	            } else if (ch == '@') {
	                if (stack.peek() != str.charAt(i+1)) {
	                    stack.push(ch);
	                }
	            } else {
	                stack.push(ch);
	            }
	        }
	        String ans = "";
	        for (char ch : stack) {
	            ans = ans + ch;
	        }
	        System.out.println(ans);
	        return ans;
	    }
	    public static void main(String[] args) {
	        String st = "hzttze   iiisuu stttub@borrrnnn";
	        decode(st);
	    }
	 
}
