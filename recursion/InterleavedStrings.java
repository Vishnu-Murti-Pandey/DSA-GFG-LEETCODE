package recursion;
import java.util.*;

public class InterleavedStrings {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();
		
		boolean f1 = solveRec(a, b, c);
		
		System.out.println(f1);

	}
	
	public static boolean solveRec(String a, String b, String c) {
		
		if(a.length()==0 && b.length()==0 && c.length()==0) {
			return true;
		}
		if(c.length() == 0) {
			return false;
		}
		
		boolean x = (a.length()!=0 && a.charAt(0)==c.charAt(0)) && (solveRec(a.substring(1), b, c.substring(1)));
		boolean y = (b.length()!=0 && b.charAt(0)==c.charAt(0)) && (solveRec(a, b.substring(1), c.substring(1)));
		
		return x||y;
	}
	

}
