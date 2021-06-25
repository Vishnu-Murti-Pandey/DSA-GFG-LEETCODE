package strings;
import java.util.Scanner;

public class ConfusedPappu {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input = 66;
		int d1 = 6; 
		int d2 = 9;
		
		System.out.println(pappu(input, d1, d2));
		
	}
	
	public static int pappu(int val, int d1, int d2) {
		int result = 0;
		int multiply = 1;
		int store = val;
		
		while(store%10 > 0) {
			int rem = val%10;
			if(rem == d1) 
				result = result + d2*multiply;
			else 
				result = result + rem*multiply; 
			multiply *= 10;
			store = store / 10;
		}
		return (result - val);
	}
}
