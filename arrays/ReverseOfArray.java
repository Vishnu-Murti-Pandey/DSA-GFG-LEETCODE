package arrays;

import java.util.Scanner;

public class ReverseOfArray {
			
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		 System.out.print("ENTER THE SIZE OF ARRAY : ");
         int n = sc.nextInt();
         int a[] = new int[n];
         int b[] = new int[n];

         for(int i=0; i<n; i++){
             a[i] = sc.nextInt();
         }
         for(int i=n; i>0; i--) {
        	 for(int j=0; j<n; j++) {	 
        		 b[j] = a[i-1];
        		 System.out.print(b[j]+" ");
        		 break;
        	 }
         }
        

	}
	
}
