package sde_sheet_180;

import java.util.Scanner;

public class SortAnArrayOf0s1s2s {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nums[] = new int[n];
		for(int i=0; i<n; i++) {
			nums[i] = sc.nextInt();
		}
		
		//countingSort(nums);
		
		dutchNationalFlagAlgo(nums);
		
		for(int i=0; i<n; i++) {
			System.out.print(nums[i]+" ");
		}
		
	}
	
	private static void dutchNationalFlagAlgo(int[] nums) {
		
		int high = nums.length-1;
		int mid = 0;
		int low = 0;
		
		while(high >= mid) {
			
			if(nums[mid]==0) {
				nums[mid] = nums[low];
				nums[low] = 0;
				low++;
				mid++;
			}
			else if(nums[mid] == 1) {
				mid++;
			}
			else {
				nums[mid] = nums[high];
				nums[high] = 2;
				high--;
			}
		}
		
		
	}

	// This algorithm uses 2 passes with time complexity of O(N) 
	
	public static void countingSort(int nums[]) {
		int zeros = 0;
        int ones = 0;
        int two = 0;
        
        for(int i=0; i<nums.length; i++) {
            if(nums[i]==0) {
                zeros++;
            }
            else if(nums[i]==1) {
                ones++;
            }
            else{
                two++;
            }
        }
        
        for(int i=0; i<nums.length; i++) {
            if(zeros != 0) {
                nums[i] = 0;
                zeros--;
            }
            else if(ones != 0) {
                nums[i] = 1;
                ones--;
            }
            else {
                nums[i] = 2;
                two--;
            }
        }
	}

}
