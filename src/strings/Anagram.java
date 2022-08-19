package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Anagram {
	
	static List<List<String>> anagram(List<String> text){
		Map<String, List<String>> map = new HashMap<>();
		
		for(String str: text) {
			char [] ch = str.toCharArray();
			Arrays.sort(ch);
			String newStr = new String(ch);
			if(!map.containsKey(newStr)) {
				map.put(newStr, new ArrayList<>());
			}
			map.get(newStr).add(str);
			
		}
		Set<Map.Entry<String, List<String>>> sets = map.entrySet();
		sets.stream().forEach(System.out::print);
		
		return new ArrayList<>(map.values());
	}
	
	public static void main(String[] args) {
		String [] str = {"eat", "acb","321", "tae", "bca","132", "ate","123"};
		
		List<String> arrayString = Arrays.asList(str);
		Anagram.anagram(arrayString);
	}

}
