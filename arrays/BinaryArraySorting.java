package arrays;
import java.util.*;

public class BinaryArraySorting {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int [n];

		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		int j = arr.length - 1;
		int count1 = 0; int count2 = 0;
		for(int i=0; i<n; i++) {
			if(arr[i] == 0)
				count1++;
			else
				count2++;
		}
		
		StringBuffer sb = new StringBuffer(); 
		
		for(int a=0; a<count1; a++) {
			sb.append("0" + " ");
		}
		for(int b=0; b<count2; b++) {
			sb.append("1" + " ");
		}
		System.out.println(sb);
		
//		for(int i=0 ;i<count1; i++) {
//			System.out.print("0"+" ");
//		}
//		for(int i=0 ;i<count2; i++) {
//			System.out.print("1"+" ");
//		}
		

	}
}
