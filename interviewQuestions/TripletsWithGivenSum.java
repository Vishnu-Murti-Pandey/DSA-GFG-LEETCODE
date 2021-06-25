package interviewQuestions;
import java.util.*;

public class TripletsWithGivenSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		int sum = sc.nextInt();
		
		for(int i=0; i<n-2; i++) {
			int curr = sum - arr[i];
			HashSet<Integer> set = new HashSet<>();
			
			for(int j=i+1; j<n; j++) {
				if(set.contains(curr-arr[j])) {
					System.out.println(arr[i] +" "+ (curr-arr[j]) +" "+ arr[j]);
					return;
				}
				set.add(arr[j]);
			}
		}
		System.out.println("No Triplets Found");
		
	}

}
