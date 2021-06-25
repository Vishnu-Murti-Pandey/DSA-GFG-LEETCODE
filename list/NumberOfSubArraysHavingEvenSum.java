package list;
import java.util.*;

public class NumberOfSubArraysHavingEvenSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		
		int count = 0;
		for(int i=0; i<=n-1; i++) {
			int sum = 0;
			for(int j=i; j<=n-1; j++) {
				sum = sum +a[j];
				if(sum%2 == 0)
					count++;
				}
			}
		System.out.println(count);	
		
	}

}
