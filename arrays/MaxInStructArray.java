package arrays;
import java.util.Scanner;

public class MaxInStructArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int feet1 = 1;
		int inches1 = 2; 
		int feet2 = 2;
		int inches2 = 1;
		
		int result = feetToInches(feet1, inches1, feet2, inches2);
		
		System.out.println(result);

	}
	
	public static int feetToInches(int a, int b, int c, int d) {
		
		a = a*12;
		b = b + a;
		c = c*12;
		d = d + c;
		return b>d? b:d;
	}
	
}
