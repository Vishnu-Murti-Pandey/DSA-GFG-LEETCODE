package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintAllSubSeqOfString {

	public static ArrayList<String> al = new ArrayList<>();
	
	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			String s = sc.next();
			subSeq(s,"");
			System.out.println(al);
		}
	}
	static void subSeq(String str, String ans) { 
		if(str.length() == 0) {
			al.add(ans);
			return;
		}
		subSeq(str.substring(1), ans+str.charAt(0));
		subSeq(str.substring(1), ans);
		
		
	}

}
