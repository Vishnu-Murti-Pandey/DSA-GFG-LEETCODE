package recursion;

import java.util.*;

public class OccurrencesOfPI {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			String s = sc.next();
			String str = PI(s);
			System.out.println(str);
		}
	}
	static String PI(String s) {
		if(s.length() <= 1) {
			return s;
		}
		if(s.charAt(0) == 'p' && s.charAt(1) == 'i' && s.length() >= 2) {
			return "3.14" + PI(s.substring(2, s.length()));
		}
		return s.charAt(0) + PI(s.substring(1, s.length()));
	}
	
}