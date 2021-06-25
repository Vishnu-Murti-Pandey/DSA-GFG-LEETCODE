package dynamicProgramming;
import java.util.*;

public class MaxProductSubarray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}

		int ans = arr[0];
		int maxPro = arr[0];
		int minPro = arr[0];
		
		for(int i=1; i<n; i++) {
			int temp = maxPro;
			maxPro = Math.max(arr[i], Math.max(maxPro*arr[i], minPro*arr[i]));
			minPro = Math.min(arr[i], Math.min(minPro*arr[i], temp*arr[i]));
			
			ans = Math.max(ans, maxPro);
		}
		
		System.out.println(ans);
	}

}
