package arrays;
import java.util.*;

public class PairArraySumProduct {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		int count = 0;
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(a[i]+a[j] < a[i]*a[j]) {
					count++;
			
				}
			}
		}
		System.out.println(count);
		//88 57 44 92 28 66 60 37 33 52 38 29 76 8 75
	}

}
