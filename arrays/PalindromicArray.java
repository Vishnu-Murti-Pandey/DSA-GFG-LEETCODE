package arrays;
import java.util.*;

public class PalindromicArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		int result = PalinArray(a,n);
		System.out.println(result);
	}
	
	public static int PalinArray(int a[], int n) {
		
		int temp = 0;
		int sum = 0; 
		int b[] = new int [n];
		
		
		for(int i=0; i<n; i++) {
			sum=0;
			b[i] = a[i];
				while(b[i]>0) {			
					temp = b[i]%10;
					sum = sum*10 + temp;
					b[i] = b[i]/10;
			
				}		
			if (sum == a[i])
				continue;
			else
				return 0;				
		}
		return 1;
	}

}
