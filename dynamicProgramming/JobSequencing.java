package dynamicProgramming;
import java.util.*;

public class JobSequencing {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Job arr[] = new Job[n];
		for(int i=0; i<n; i++) {
			int id = sc.nextInt();
			int deadline = sc.nextInt();
			int profit = sc.nextInt();
			arr[i] = new Job(id, deadline, profit);
		}
		
		Arrays.sort(arr, (a, b) -> b.profit - a.profit);
		
		int maxId = 0;
		for(int i=0; i<n; i++) {
			Job j = arr[i];
			maxId = Math.max(maxId, j.deadline);
		}
		
		int dp[] = new int[maxId+1];
		int totalProfit = 0;
		int jobsCount = 0;
		
		for(int i=1; i<=n; i++) {
			Job job = arr[i];
			
			
			
		}
		
		

	}

}

class Job {
	int id;
	int deadline;
	int profit;
	
	public Job(int id, int deadline, int profit) {
		this.id = id;
		this.deadline = deadline;
		this.profit = profit;
	}
	
}
