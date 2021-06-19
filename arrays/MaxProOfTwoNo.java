package arrays;
import java.util.*;

public class MaxProOfTwoNo {

	public static void main(String[] args) {

			Scanner sc  = new Scanner(System.in);
			int n = sc.nextInt();
			int a[] = new int[n];
			
			for(int i=0; i<n; i++) {
				a[i] = sc.nextInt();
			}
			
			Arrays.sort(a);
			int pro = 0;
			for(int i=0; i<n; i++) {
				pro = a[n-1] *a[n-2];
			}
			System.out.println(pro);
	}

}
