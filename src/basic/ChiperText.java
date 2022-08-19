package basic;

public class ChiperText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChiperText.chiperText("hzttzze  iiisuu sttubbb@borrn");

	}

	public static void chiperText(String text) {

		char [] chars = text.toCharArray();
		char [] newChar = new char[text.length()];
		int len = chars.length;
		int j = 0;
		for(int i = 0; i < len - 1; i++) {
			if( len-2 > i ) {
				if(chars[i] == chars[i+1]) {
					newChar[j]= chars[i+2];
					++j;
				}else if((chars[i] == chars[i+2]) && chars[i+1] == '@') {
					newChar[j] = chars[i];
					++j;
					newChar[j] = chars[i+2];
					j++;
				}else {
					newChar[j] = chars[i];
					++j;
				}
			}
		}
		
		System.out.println("ciper word is: "+String.valueOf(newChar));
	}

}
