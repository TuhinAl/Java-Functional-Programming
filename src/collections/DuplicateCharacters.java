package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuplicateCharacters.countDuplicate("programming");
	}
	
	public static void countDuplicate(String string) {
		
		Map<Character, Integer> map = new HashMap<>();
		
		char[] chars = string.toCharArray();
		for(char ch : chars) {
			if(map.containsKey(ch)) {
				map.put(ch,map.get(ch)+1);
			}else {
				map.put(ch,1);
			}
		}
		
		Set<Map.Entry<Character, Integer>> sets = map.entrySet();
		sets.stream().forEach(System.out::print);
	} 
	
	

}
