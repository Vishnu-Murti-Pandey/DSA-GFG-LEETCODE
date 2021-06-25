package interviewQuestions;
import java.util.*;

public class MaxiSubarraySumKadaneAlgo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int currBest = arr[0];
		int overAllBest = arr[0];
		
		for(int i=1; i<n; i++) {
			if(currBest >= 0) {
				currBest = currBest + arr[i];
			}
			else {
				currBest = arr[i];
			}
			if(currBest>overAllBest) {
				overAllBest = currBest;
			}
		}
		System.out.println(overAllBest);

	}

}
