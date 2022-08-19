package basic;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacter {
	
	public static void duplicateCharacter(String word){
		
		char [] chars = word.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		
		for(Character ch : chars) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}else {
				map.put(ch, 1);
			}
		}
		
		System.out.printf("List of duplicate characters in String '%s' %n",word);
		for(Map.Entry<Character, Integer> itr : map.entrySet()) {
			if(itr.getValue() > 0) {
				System.out.printf("%s : %d %n", itr.getKey(), itr.getValue());
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuplicateCharacter.duplicateCharacter("Programming");
		DuplicateCharacter.duplicateCharacter("Combination");
		DuplicateCharacter.duplicateCharacter("Java");
	}

}

