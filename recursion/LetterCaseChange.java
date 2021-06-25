package recursion;
import java.util.*;

public class LetterCaseChange {
	
	static ArrayList<String> al = new ArrayList<>();
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String op = "";
		change(s, op, al);
		System.out.println(al);
		
	}
	
	public static void change(String ip, String op, ArrayList<String> al) {
		if(ip.length() == 0) {
			al.add(op);
			return;
		}
		if(Character.isAlphabetic(ip.charAt(0))) {
			String op1 = op;
			String op2 = op;
			op1 = op1 + ip.substring(0, 1).toLowerCase();
			op2 = op2 + ip.substring(0, 1).toUpperCase();
			ip = ip.substring(1);
			change(ip, op1, al);
			change(ip, op2, al);
			return;
		}
		else {
			String op1 = op;
			op1 = op1 + ip.substring(0, 1);
			ip = ip.substring(1);
			change(ip, op1, al);
			return;
		}
		
		
		
	}

}
