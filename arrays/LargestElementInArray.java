package arrays;
import java.util.Scanner;

public class LargestElementInArray {

	public static void main(String[] args) {
		
		int a[] = {100,55,6976,4522,666666,15,2,4,65,5156944};
		int n = a.length;
		int temp = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(a[i] < a[j]) {
					temp = a[j];	
						}
				else
					temp = a[i];					
				}
			}
		System.out.println(temp);
		}
	}


