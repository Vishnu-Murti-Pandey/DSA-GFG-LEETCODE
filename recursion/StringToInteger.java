package recursion;
import java.util.*;
import java.math.*;

public class StringToInteger {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			String s = sc.next();
			long a = toInt(s);
			System.out.println(a);
		}
	}
	static long toInt(String str) {
		int x = str.charAt(0) - '0';
		if(str.length() <= 1) {
			return x;
		}
		int m = x;
		m = m%10;
		m = m *(int)Math.pow(10, str.length()-1);
		return m + toInt(str.substring(1, str.length()));
	}
}