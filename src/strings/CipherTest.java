package strings;

import java.util.Stack;

public class CipherTest {

	
	static String decode(String text) {
		Stack<Character> stack = new Stack<>();
		stack.push(text.charAt(0));
		
		for(int i = 1; i < text.length(); i++) {
			char ch = text.charAt(i);
			if(stack.peek() == ch && text.charAt(i - 1) != '@') {
				stack.pop();
			} else if(ch == '@') {
				if(stack.peek() != text.charAt(i+1)) {
					stack.push(ch);
				}
			}else {
				stack.push(ch);
			}
		}
		
	String ans = "";
	for(char ch : stack) {
		ans += ch;
	}
	System.out.println(ans);
		
		return ans;
	}
	
	public static void main(String[] args) {
		  String st = "hzttze   iiisuu stttub@borrrnnn";
	        decode(st);
	}
}
