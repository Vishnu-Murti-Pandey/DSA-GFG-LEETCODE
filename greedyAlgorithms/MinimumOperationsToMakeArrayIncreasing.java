package greedyAlgorithms;
import java.util.*;

public class MinimumOperationsToMakeArrayIncreasing {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nums[] = new int[n];
		for(int i=0; i<n; i++) {
			nums[i] = sc.nextInt();
		}
		
		int minOp = 0;
        
        for(int i=1; i<nums.length; i++) {
            
            if(nums[i] <= nums[i-1]) {
                int max = nums[i-1] + 1;
                
                minOp = minOp + (max - nums[i]);
                nums[i] = max;
            }
            
        }
        
        System.out.println(minOp);
	}

}
