package whileloops;

import java.util.Scanner;

public class Sumofdigits {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
																		// eg : 1234;  ->  4321

		System.out.println("enter the number");
		int n = sc.nextInt();
		int sum = 0;
		int r;
		int temp = n;
		
		while(n>0) {
			
			r = n % 10;
			sum = sum +r;
			n = n / 10;
		}
		
		System.out.println("the sum of digits "+ temp+" is "+sum);

	}

}
