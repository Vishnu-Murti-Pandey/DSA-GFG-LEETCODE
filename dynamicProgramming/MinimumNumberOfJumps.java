package dynamicProgramming;
import java.util.*;

public class MinimumNumberOfJumps {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
 		}
		
		System.out.println(solve(arr));

	}
	
	public static int solve(int arr[]) {
		
		int n = arr.length;
		
		if(arr[0] == 0) {
            return -1;
        }
        
        int jumps = 1;
        int steps = arr[0];
        int max = arr[0];
        
        for(int i=1; i<=n; i++) {
            if(i == n-1) {
                return jumps;
            }
            max = Math.max(max, i+arr[i]);
            steps--;
            
            if(steps == 0) {
                jumps++;
                if(i >= max) {
                    return -1;
                }
                steps = max - i;
            }
        }
        return jumps;
	
	}

}
