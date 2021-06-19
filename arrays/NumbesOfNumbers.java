package arrays;
import java.util.Scanner;

public class NumbesOfNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int a[] = new int[n];
		for(int i=0; i<n; i++)
			a[i] = sc.nextInt();
		int k = sc.nextInt();
		int result = Num(a, n, k);
		System.out.println(result);
	}
	
	public static int Num(int a[], int n, int k) {
		int count = 0;
		for(int i=0; i<n; i++) {
			int temp = a[i];
			while(temp > 10) {
				int mod = temp%10;
				if(mod == k) {
					count++;	}
				temp = temp / 10;	}
				if(temp == k) {
					count++;	}
			}
		return count;
		}

}
