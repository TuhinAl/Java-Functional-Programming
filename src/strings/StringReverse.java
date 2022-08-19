package strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringReverse {
	
	public static void reverseString(String text) {
		List<String> stringAsList = Arrays.asList(text.split("\\s"));
		StringBuilder builder = new StringBuilder();
		Collections.reverse(stringAsList);
		
		for(String s : stringAsList) {
			builder.append(s);
			builder.append(" ");
		}
		
		System.out.println(builder);
	}
	
	public static void main(String[] args) {
		StringReverse.reverseString("Bangladesh is a beautiful country");
	}

}
