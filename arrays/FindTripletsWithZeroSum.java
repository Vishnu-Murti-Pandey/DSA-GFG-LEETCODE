package arrays;

import java.util.Scanner;

public class FindTripletsWithZeroSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean found = false;
		
		int arr[] = new int[n];
		for(int i=0; i<n ; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<n-2; i++) {
			for(int j=i+1; j<n-1; j++) {
				for(int k=j+1; k<n; k++) {
					if(arr[i] + arr[j] + arr[k] == 0) {
						found = true;}
			}
		}
		
	}
		if(found == false)
			System.out.println("not exist");
		else
			System.out.println(found);



	}

}
