package arrays;
import java.util.*;

public class NumberOfOccurrence {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int a[] = new int[n];
		
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		
		int count = 0;
		for(int i=0; i<n; i++) {
			if(a[i] == x) {
				count++;
			}
		}
		if(count == 0)
			System.out.println(-1);
		else
			System.out.println(count);
		
	}

}
