package loops;
import java.util.Scanner;

public class Fibbonacci {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the value of n");
		
		int n = sc.nextInt();
		
		int a = 0;
		int b = 1;
		int c;
		int i;

		System.out.println("the required result is ");
		System.out.print(a+" ");
		System.out.print(b+" ");

		
		for(i=0;i<n-2;i++) {
			
			c = a+b;
			System.out.print(c+" ");
			a = b;
			b = c;
			
		}
	}

}
