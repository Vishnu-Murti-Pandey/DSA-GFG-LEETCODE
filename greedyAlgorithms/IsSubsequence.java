package greedyAlgorithms;
import java.util.*;

public class IsSubsequence {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		
		System.out.println(solve(s, t));
		

	}
	
	public static boolean solve(String s, String t) {
		
		if(s.length() == 0) {
			return true;
		}
        int idxS = 0, idxT = 0;
        while (idxT < t.length()) {
            if (t.charAt(idxT) == s.charAt(idxS)) {
                idxS++;
                if (idxS == s.length()) return true;
            }
            idxT++;
        }
        return false;
		
	}

}
