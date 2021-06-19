package arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		int a [] = {15, -8, 9, -1, 18, 13, 0};
		
		int n = a.length;
		
		boolean sorted = true;
		
		int temp = 0;
		
		for(int i=0; i<n-1; i++){
			for(int j=0; j<n-1; j++) {				//also->  for(int j=0; j<n-1-i; j++)
				if(a[j] > a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					
					sorted = false; 
				}
			}
			if(sorted) break;						//check condition
			
		}
		for(int item: a) {
			System.out.print(item+ "  ");
		}

	}
	
}
