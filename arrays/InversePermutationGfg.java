package arrays;
import java.util.Scanner;

public class InversePermutationGfg {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		
	for(int i=0; i<n; i++)
		arr[i] = sc.nextInt();
		
	for(int i=0; i<n; i++) {
		for(int j=0; j<n; j++) {
			if(arr[j] == i+1) {
				System.out.println(j + 1 +" ");
				break; }
			
			}
		}
	
	}
	
}
