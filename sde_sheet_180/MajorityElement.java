package sde_sheet_180;
import java.util.*;

public class MajorityElement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nums[] = new int[n];
		for(int i=0; i<n; i++) {
			nums[i] = sc.nextInt();
		}
		
		int count = 0;
        int ele = 0;
        
        
        
        for(int i=0; i<nums.length; i++) {
            if(count == 0) {
                ele = nums[i];
            }
            if(nums[i] == ele) {
                count++;
            } else {
                count--;
            }
        }
        
        System.out.println(ele);
	}

}
