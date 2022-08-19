package collections;

public class StringPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringPermutation.permutation("123", 0, "123".length()-1);

	}
	public static void permutation(String value, int l, int r) {
		if(l == r) {
			System.out.println(value);
		}else {
			
			for(int i = l; i <= r; i++) {
				value = swap(value, l, i);
				permutation(value, l+1, r);
				value = swap(value, l, i);
			}
		}
	}
	
	public static String swap(String value, int i, int j) {
		char [] chars = value.toCharArray();
		char temp;
		temp = chars[i];
		chars[i] = chars[j];
		chars[j] = temp;
		return String.valueOf(chars);
	}
	

}
