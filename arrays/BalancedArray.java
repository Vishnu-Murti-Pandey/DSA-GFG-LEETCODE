package arrays;
import java.util.Scanner;

public class BalancedArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int [n];
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<n/2; i++) {
			sum1 = sum1 + arr[i];
		}
		for(int i=n/2; i<n; i++) {
			sum2 = sum2 + arr[i];
		}
		int diff = sum1 - sum2;
		if(sum1 == sum2) {
			System.out.println("array is balanced");
		}
		else
			System.out.println("array is unbalanced with a difference of : "+diff);
		if(diff<0) {
			diff =-diff;
			System.out.println("add "+diff +" to left side of array");
			}
		else
			System.out.println("add "+diff +" to right side of array");
		
	}

}
