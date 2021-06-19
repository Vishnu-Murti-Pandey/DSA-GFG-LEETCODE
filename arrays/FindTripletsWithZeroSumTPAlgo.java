package arrays;
import java.util.*;

public class FindTripletsWithZeroSumTPAlgo {

	public static void main(String[] args) {
		
		int arr[] = {-4, -1, 0, 2, 3, 3, 4};
		int n = arr.length;
		int x= 5;
		
		boolean result = twoSum(arr, x);
		System.out.println(result);
	}
	
	public static boolean twoSum(int a[], int s) {
		
		int i=0; int j=a.length - 1;
	while(i < j) {
		if(a[i] + a[j] <s)
			i++;
		else if(a[i] + a[j] >s)
			j--;
		else
			return true;	
		}
		return false;
	}
	
}
