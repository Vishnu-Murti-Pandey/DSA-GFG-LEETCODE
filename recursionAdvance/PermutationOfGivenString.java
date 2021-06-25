package recursionAdvance;
import java.util.*;

public class PermutationOfGivenString {

	static Set<String> set = new HashSet<>();
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		permutation(s, 0, n-1);	
	}
	static void permutation(String s, int l, int r) {
		if(l == r) {
			if(set.contains(s)) {
				return;
			}
			set.add(s);
			System.out.print(s+" ");
			return;
		}
		for(int i=l; i<=r; i++) {
			s = interchange(s, l, i);
			permutation(s, l+1, r);
			s = interchange(s, l, i);
		}
	}
	static String interchange(String s, int a, int b) {
		char ch[] = s.toCharArray();
		char temp = ch[a];
		ch[a] = ch[b];
		ch[b] = temp;
		return String.valueOf(ch);
	}
}
