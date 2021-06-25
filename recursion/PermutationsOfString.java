package recursion;
import java.util.*;

public class PermutationsOfString {

	static Set<String> set = new HashSet<>();
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String op = "";
		op = op + s.substring(0, 1);
		s = s.substring(1);
		permu(s, op);
		System.out.println(set);
	}
	
	public static void permu(String ip, String op) {
		if(ip.length() == 0) {
			set.add(op);
			return;
		}
		String op1 = op; 
		String op2 = op;
		op1 = op1 + " " + ip.substring(0, 1);
		op2 = op2 + ip.substring(0, 1);
		ip = ip.substring(1);
		permu(ip, op1);
		permu(ip, op2);
		return;
	}

}
