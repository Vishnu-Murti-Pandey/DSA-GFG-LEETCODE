package maps;
import java.util.*;

public class SmallestSubstringOfAStringContainingAllCharactersOfAnotherString {
	public static String solution(String s1, String s2) {
        
        String ans = "";
        
        HashMap<Character, Integer> hm = new HashMap<>();
        
        for(int i=0; i<s2.length(); i++) {
            if(hm.containsKey(s2.charAt(i))) {
                hm.put(s2.charAt(i), hm.get(s2.charAt(i))+1);
            }
            else {
                hm.put(s2.charAt(i), 1);
            }
        }
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        int mct = 0;
        int max = s2.length();
        
        int i = -1;
        int j = -1;
        
        while(true) {
            boolean f1 = false;
            boolean f2 = false;
            
            // aquire the elements
            while(i<s1.length()-1 && mct<max) {
                i++;
                char ch = s1.charAt(i);
                map.put(ch, map.getOrDefault(ch, 0)+1);
                
                if(map.getOrDefault(ch, 0) <= hm.getOrDefault(ch, 0)) {
                    mct++;
                }
                f1 = true;
            }
            // collect and release
            while(j<i && mct==max) {
                String pans = s1.substring(j+1, i+1);
                if(ans.length()==0 || ans.length()>pans.length()) {
                    ans = pans;
                }
                j++;
                char ch = s1.charAt(j);
                if(map.get(ch) == 1) {
                    map.remove(ch);
                }
                else {
                    map.put(ch, map.get(ch)-1);
                }
                if(map.getOrDefault(ch, 0) < hm.getOrDefault(ch, 0)) {
                    mct--;
                }
                f2 = true;
            }
            if(!f1 && !f2) {
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s1 = scn.next();
        String s2 = scn.next();
        System.out.println(solution(s1, s2));
    }
	
}
