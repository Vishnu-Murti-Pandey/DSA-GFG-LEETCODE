package strings;
import java.util.Scanner;

public class SumOfAlphanumericNumbers {

	public static void main(String[] agrs) {
		
		String input = "1abc23gfg1";
		
		int result = Alphanumeric(input);
		System.out.println(result);
		
	}
	
	public static int Alphanumeric(String str) {
		
		int sum = 0;
		String temp = "";
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
				if(Character.isDigit(ch)) {
					temp = temp + ch;
//					System.out.println(temp);
				}
				else {
					sum = sum + Integer.parseInt(temp);
					temp = "0";
					
				}
			}
			return sum + Integer.parseInt(temp);
	
	}
}
