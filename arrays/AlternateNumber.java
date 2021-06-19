package arrays;
import java.util.*;

public class AlternateNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int [n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
					}
			print(arr, n);
	}
	
		public static void print(int arr[], int n) {
			
			for(int i=0; i<n; i++) {
				if(i%2 == 0)
					System.out.println(arr[i]);
				}			
		}
}
