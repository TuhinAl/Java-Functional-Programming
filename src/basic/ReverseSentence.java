package basic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseSentence {
	public static void reverseSentence(String line) {
		List<String> list = Arrays.asList(line.split("\\s"));
		Collections.reverse(list);
		
		StringBuilder sb = new StringBuilder();
		for(String string: list) {
			sb.append(string);
			sb.append(" ");
		}
		System.out.println(sb.toString().trim());
	}
	
	public static void main(String[] args) {
		ReverseSentence.reverseSentence("Alauddin Tuhin is a very good Student");
	}

}
