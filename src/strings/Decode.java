package strings;

import java.util.Stack;

public class Decode {
	static String decode(String text) {
		
		Stack<Integer> numStack = new Stack<>();
		Stack<String> strStack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		
		int len = text.length();
		for(int i =0; i < len; i++) {
			char ch = text.charAt(i);
			if(Character.isDigit(ch)) {
				int num = ch - '0';
				while(i+1 < len && Character.isDigit(text.charAt(i+1))) {
				num *= 10 + text.charAt(i+1) - '0';
				i++;
				}
				numStack.push(num);
			}else if(ch == '[') {
				strStack.push(sb.toString());
				sb = new StringBuilder();
			}else if(ch == ']') {
				int k = numStack.pop();
				StringBuilder strBuilder = new StringBuilder(strStack.pop());
				for(int j = 0; j < k; j++) {
					strBuilder.append(sb);
				}
				sb = strBuilder;
			}else {
				sb.append(ch);
			}
			
		}
		System.out.println(sb.toString());
		return sb.toString();
	}
	
	public static void main(String[] args) {
		Decode.decode("2[abc]3[cd]ef");
	}
}
