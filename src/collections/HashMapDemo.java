package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		Map< String, String> map = new HashMap<>();
		
		map.put("laliga", "Real Madrid");
		map.put("epl", "Manchester City");
		map.put("french", "Paris Saint Germaan");
		map.put("league-1", "Juventus");
		map.put("bpl", "Mohamedan");
		map.put(null, "");
		//map.put(null, "adsdasd");
		map.put("lpl", "no team");
		
//		for(Map.Entry<String, String> m : map.entrySet()) {
//		System.out.println(m.getKey() +" ==> "+m.getValue());
//		}
		
		Set<Map.Entry<String, String>> mm = map.entrySet();
		mm.stream().forEach( System.out::println);
	}
	
	
}
