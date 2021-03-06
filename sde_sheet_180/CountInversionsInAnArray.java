package sde_sheet_180;
import java.util.*;

public class CountInversionsInAnArray {
	
	static int count = 0;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long arr[] = new long[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int low = 0;
        int high = n-1;
        
        count = 0;
        
        long ans[] = mergeSort(arr, low, high);
        
        System.out.println(count);
        
	}

	static long[] mergeSort(long[] arr, int low, int high) {
		
		if(low == high) {
			long ba[] = new long[1];
			ba[0] = arr[low];
			return ba;
		}
		
		int mid = (low+high)/2;
        
        long lsa[] = mergeSort(arr, low, mid);
        long rsa[] = mergeSort(arr, mid+1, high);
        
        long merged[] = merge(lsa, rsa);
        
        return merged;
		
    }
	
	static long[] merge(long a[], long b[]) {
		
		long temp[] = new long[a.length+b.length];
		
        int i = 0;
        int j = 0;
        int k = 0;
        
        while(i<a.length && j<b.length) {
            if(a[i] <= b[j]) {
                temp[k] = a[i];
                k++;
                i++;
            }
            else {
                count = count + (a.length-i);
                temp[k] = b[j];
                k++;
                j++;
            }
        }
        
        while(i<a.length) {
            temp[k] = a[i];
            k++;
            i++;
        }
        
        while(j<b.length) {
            temp[k] = b[j];
            k++;
            j++;
        }
        
        return temp;
    }

//	private static void bruteForce(long[] arr, int n) {
//		int count = 0;
//		
//		for(int i=0; i<n-1; i++) {
//			for(int j=i+1; j<n; j++) {
//				if(arr[i]>arr[j]) {
//					count++;
//				}
//			}
//		}
//		
//		System.out.println(count);
//	}
	
	

}
