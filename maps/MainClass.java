package maps;
import java.util.*;
import java.util.Map.Entry;

public class MainClass {

	public static void main(String[] args) {
		
		
		Map<String, Integer> numbers = new HashMap<>();
		for(int x: numbers.values()) {
			
		}
	
//		
//		numbers.put("one", 1);
//		numbers.put("two", 2);
//		numbers.put("five", 5);
//		
//		Set<Entry<String, Integer>> entries = numbers.entrySet();
//		
//		for(Entry<String, Integer> entry: entries) {
//			entry.setValue(entry.getValue() * 100);
//			
//		}
//		System.out.println(numbers);
		
		String s = "CAT";
		int result = getHash(s);
		System.out.println(result);
		
	}

	
	public static int getHash(String s) {
		int hash = 0;
		for(int i=0; i<s.length(); i++) {
			hash = hash + s.charAt(i);
		}
		return hash;
	}

}
