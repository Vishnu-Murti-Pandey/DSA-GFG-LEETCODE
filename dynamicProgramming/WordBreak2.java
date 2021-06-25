package dynamicProgramming;
import java.util.*;

public class WordBreak2 {
	
	public static HashMap<String, List<String>> map;	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		List<String> al = new ArrayList<>(n);
		for(int i=0; i<n; i++) {
			al.add(sc.next());
		}
		String str = sc.next();
		
		map = new HashMap<>();
		
		List<String> list = solve(str, al);
		
		for(int i=0; i<list.size(); i++) {
			System.out.print("("+list.get(i)+")");
		}
		
	}
	

	public static List<String> solve(String s, List<String> wordDict) {
		
		List<String> result = new ArrayList<String>();
		if (map.containsKey(s))
			return map.get(s);

		for (String w : wordDict) {

			if (w.length() > s.length())
				continue;

			String firstWord = s.substring(0, w.length());
			if (firstWord.equals(w)) {

				if (s.length() == w.length()) {
					result.add(0, w);
				} else {
					String leftOne = s.substring(w.length(), s.length());
                    List<String> tmp = solve(leftOne, wordDict);

					for (String val : tmp) {
						String sb = w + " " + val;
						result.add(0, sb);
					}
				}
			}
		}

		map.put(s, result);
		return result;
	}	

}
