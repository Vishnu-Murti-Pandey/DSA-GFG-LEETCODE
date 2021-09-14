package sorting;

import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int low = 0;
        int high = n-1;
        
        int ans[] = mergeSort(arr, low, high);
        
        for(int i=0; i<ans.length; i++) {
            System.out.print(ans[i]+" ");
        }

	}
	
	static int[] mergeSort(int[] arr, int low, int high) {
		
		if(low == high) {
			int ba[] = new int[1];
			ba[0] = arr[low];
			return ba;
		}
		
		int mid = (low+high)/2;
        
        int lsa[] = mergeSort(arr, low, mid);
        int rsa[] = mergeSort(arr, mid+1, high);
        
        int merged[] = merge(lsa, rsa);
        
        return merged;
		
    }
	
	static int[] merge(int a[], int b[]) {
		
		int temp[] = new int[a.length+b.length];
		
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
	

}
