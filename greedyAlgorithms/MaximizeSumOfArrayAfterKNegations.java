package greedyAlgorithms;
import java.util.*;

public class MaximizeSumOfArrayAfterKNegations {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nums[] = new int[n];
		for(int i=0; i<n; i++) {
			nums[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		
		PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> a - b);
        
        for(int i=0; i<nums.length; i++) {
            pq.add(nums[i]);
        }
        
        int ans = 0;
        
        for(int i=0; i<k; i++) {
            int t = pq.poll();
            pq.add(-t);
        }
        
        while(!pq.isEmpty()) {
            ans = ans + pq.poll();
        }
        
		System.out.println(ans);

	}

}
