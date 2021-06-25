package strings;
import java.util.*;


public class CountingTheGameGfg {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		int result = counting(input);
		System.out.println(result);
		
	}
	
	public static int counting(String str) {
		
		int count = 1; 
		for(int i=0; i<str.length() - 1; i++) { 
				if(Character.isUpperCase(str.charAt(i)))
					count++;
			}
		return count;
	}
	
}
