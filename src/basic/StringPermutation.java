package basic;

public class StringPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringPermutation.permutation2("123", 0, "123".length()-1);
	}
	
	public static void permutation2(String string, int start, int end) {
		if(start == end) {
			System.out.println(string+" ");
		}else {
			for(int i = start; i <= end; i++) {
				string = swap(string, start, i);
				permutation2(string, start+1, end);
				string = swap(string, start, i);
			}
		}
	}
	
	public static String swap(String string, int start, int end) {
		
		char [] chars = string.toCharArray();
		char temp;
		
		temp = chars[start];
		chars[start] = chars[end];
				chars[end] = temp;
				return String.valueOf(chars);
		
	}

}
