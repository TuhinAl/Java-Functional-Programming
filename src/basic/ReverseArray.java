package basic;


public class ReverseArray {
	
	public static void reverseArray(String []sentence) {
		
		for(int i = 0; i < sentence.length/2; i++) {
			String temp = sentence[sentence.length - 1 - i];
			sentence[sentence.length - 1 - i] = sentence[i];
			sentence[i] = temp;
		}
		
		for(int i = 0; i< sentence.length; i++) {
			System.out.println(sentence[i]);
		}
	}
	public static void main(String[] args) {
		String [] sentence = {"Tuhin","Faria", "Tasnea", "Hridoy"};
		ReverseArray.reverseArray(sentence);
	}

}
