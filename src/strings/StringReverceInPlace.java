package strings;

public class StringReverceInPlace {
	
	public static void main(String[] args) {
		StringReverceInPlace.stringAndWordReverse("Bangladesh is a beautiful country");
	}
	
	public static String stringAndWordReverse(String text) {
	
		char chs [] = text.toCharArray();
		reverse(chs, 0, chs.length-1);
		reverseWord(chs);
		String s = cleanSpace(chs);
		System.out.println(s);
		return s;
	}
	public static String cleanSpace(char ch []) {
		int left = 0, right = 0;
		while(right < ch.length) {
			while(right < ch.length && ch[right] == ' ') right++;
			while(right < ch.length && ch[right] != ' ') {
				ch[left] = ch[right];
				left++;
				right++;
			}
			while(right < ch.length && ch[right] == ' ') right++;
			if(right < ch.length) {
				ch[left] = ' ';
				left++;
			}
		}
		return new String(ch).substring(0, left);
	}
	
	public static void reverse(char [] ch, int left, int right) {
		while(left < right) {
			char temp = ch[left];
			ch[left] = ch[right];
			ch[right] = temp;
			left++;
			right--;
		}
	}
	
	public static void reverseWord(char [] ch) {
		int left = 0, right = 0;
		while(left < ch.length) {
			while(left < ch.length && ch[left] == ' ') {
				left++;
			}
			right = left;
			
			while(right < ch.length && ch[right] != ' ') {
				right++;
				reverse(ch, left, right - 1);
				left = right;
			}
		}
	}
}
