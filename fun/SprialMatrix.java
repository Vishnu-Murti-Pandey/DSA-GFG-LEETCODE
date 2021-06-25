package fun;

import java.util.*;

public class SprialMatrix {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int a[][] = new int[n][m];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		 int top = 0;
	     int down = a.length-1;
	     int right = a[0].length-1;
	     int left = 0;
	     
	     int dict = 0;
	     
	     ArrayList<Integer> al = new ArrayList<>(n*m);			
	     
	     while(top<=down && left<=right) {
	         
	         if(dict == 0) {
	             for(int i=left; i<=right; i++) {
	                 al.add(a[top][i]);
	             }
	             top++;
	         }
	         else if(dict == 1) {
	             for(int i=top; i<=down; i++) {
	                 al.add(a[i][right]);
	             }
	             right--;
	         }
	         else if(dict == 2) {
	             for(int i=right; i>=left; i--) {
	                 al.add(a[down][i]);
	             }
	             down--;
	         }
	         else {
	             for(int i=down; i>=top; i--) {
	                 al.add(a[i][left]);
	             }
	             left++;
	         }
	         dict = (dict+1)%4;
	     }
	     for(int x: al) {
	    	 System.out.print(x+" ");
	     }
	}
	
}
