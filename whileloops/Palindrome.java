package whileloops;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		
		Scanner  sc = new Scanner(System.in);
		
		System.out.print("enter the number ");
		int n = sc.nextInt();
		int str = 0;
		int r;
		int temp = n;
		
		while(n>0) {
			r = n % 10;
			str = str*10 + r;
			n = n / 10;
		}
		if(temp == str) 
			System.out.println("number is palindrome");
		else
			System.out.println("number is not palindrome");

	}

}
