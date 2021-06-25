package loops;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the value of n");
		int n = sc.nextInt();
		
		int i;
		boolean  isPrime = true;
		
		for(i=2;i<=n-1;i++) {                     //for(i=0;i*i <= n;i++)  for best complexity
			                                      //for finding any number to be prime or not check it for only under root n times i<=|n
			if(n % i == 0) {
				isPrime = false;
				break;
			}
			
		}
		if(n < 2)
			isPrime = false;
		
		System.out.println(" isPrime "+ isPrime);
		
	}

}
