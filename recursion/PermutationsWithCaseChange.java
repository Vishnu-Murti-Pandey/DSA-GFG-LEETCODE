package recursion;
import java.util.*;

public class PermutationsWithCaseChange {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String op = "";
		change(s, op);
	}
	
	public static void change(String ip, String op) {
		if(ip.length() == 0) {
			System.out.print(op+" ");
			return;
		}
		String op1 = op;
		String op2 = op;
		op1 = op1 + ip.substring(0, 1).toUpperCase();
		op2 = op2 + ip.substring(0, 1);
		ip = ip.substring(1);
		change(ip, op1);
		change(ip, op2);
		return;
	}

}
