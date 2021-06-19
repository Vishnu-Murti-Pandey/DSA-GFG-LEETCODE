package arrays;
import java.util.*;

public class CyclicallyRotateAnArrayByOne {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		b[0] = a[n-1];
		for(int j=0; j<n-1; j++) {
			b[j+1] = a[j];
		}
		for(int i=0; i<n; i++) {
			System.out.print(b[i] +" ");
		}
	}

}
