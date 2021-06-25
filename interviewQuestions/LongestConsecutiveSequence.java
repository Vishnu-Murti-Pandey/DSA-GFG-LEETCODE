package interviewQuestions;
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
        
        for(int i=0; i<n; i++) {
            set.add(nums[i]);
        }
        
        int maxLen = 0;
            
        for(int i=0; i<n; i++) {
            int val = nums[i]-1;
            
            if(!set.contains(val)) {
                int x = nums[i];
                while(set.contains(x)) {
                    x++;
                }
                maxLen = Math.max(maxLen, x-nums[i]);
            } 
        }
        
        System.out.println(maxLen);
	}

}
