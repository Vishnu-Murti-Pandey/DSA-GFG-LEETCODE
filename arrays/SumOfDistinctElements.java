package arrays;
import java.util.*;

public class SumOfDistinctElements {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int [n];
		
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		
		int sum = a[0];
		for(int i=0; i<n-1; i++) {
			if (a[i] != a[i + 1]) { 
                sum = sum + a[i+1]; 
					}
			}
		System.out.println(sum);	
		}
		
	}

