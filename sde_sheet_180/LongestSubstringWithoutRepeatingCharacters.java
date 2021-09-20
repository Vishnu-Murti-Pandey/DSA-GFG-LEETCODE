package sde_sheet_180;
import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
//		int ans = betterApproch(str);
//		System.out.println(ans);
		
		int res = bestApproch(str);
		System.out.println(res);

	}

	private static int bestApproch(String s) {
		
		int i = 0;
        int j = 0;
        
        int len = 0;
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        while(i < s.length()) {
            char ch = s.charAt(i);
            if(map.containsKey(ch)) {
                j = Math.max(map.get(ch)+1, j);
            }
            map.put(ch, i);
            len = Math.max(len, i-j+1);
            i++;
        }
        
        return len;
		
	}

	private static int betterApproch(String s) {
		
		int i = 0;
        int j = 0;
        
        int len = 0;
        
        HashSet<Character> set = new HashSet<>();
        
        while(i < s.length()) {
            char ch = s.charAt(i);
            if(set.contains(ch)) {
                set.remove(s.charAt(j));
                j++;
            }
            else {
                set.add(ch);
                len = Math.max(len, i-j+1);
                i++;
            }
        }
        
        return len;
	}

}
