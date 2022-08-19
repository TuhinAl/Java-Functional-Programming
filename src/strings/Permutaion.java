package strings;

import basic.Stringpermutation;

public class Permutaion {
	
	static void permute(String text, int start, int end) {
		if(start == end) {
			System.out.println(text+" ");
		}else {
			for(int i = start; i <= end; i++) {
				text = swap(text, start, i);
				permute(text, start +1, end);
				text = swap(text, start, i);
			}
		}
	}
	
	static String swap(String text, int start, int end) {
		char ch[] = text.toCharArray();
		char temp = ch[start];
		ch[start] = ch[end];
		ch[end] = temp;
		return String.valueOf(ch);
	}
	
	public static void main(String[] args) {
		Permutaion.permute("123", 0, "123".length()-1);
	}

}
