package sde_sheet_180;
import java.util.*;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nums[] = new int[n];
		for(int i=0; i<n; i++) {
			nums[i] = sc.nextInt();
		}
		
		HashSet<Integer> set = new HashSet<>();
        
        for(int i=0; i<nums.length; i++) {
            set.add(nums[i]);
        }
        
        int maxLen = 0;
        
        for(int i=0; i<nums.length; i++) {
            int ele = nums[i] - 1;
                
            if(!set.contains(ele)) {
                int val = nums[i];
                while(set.contains(val)) {
                    val++;
                }
                if(maxLen < val-nums[i]) {
                    maxLen = val - nums[i];
                }
            }
        }
        
        System.out.println(maxLen);
	}

}
