package sde_sheet_180;

import java.util.Scanner;

public class SearchIn2DMatrix2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int mat[][] = new int[n][m];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		int tar = sc.nextInt();
	   
        int i = 0;
        int j = m-1;
        
        // best optimal solution
        
        // start from last column of first row
        // if current element is greater than target element move left and if current element is smaller then move down.
        
        while(i<=n-1 && j>=0) {
            if(mat[i][j] == tar) {
                System.out.println(true);    
                return;
            } 
            else {
                if(mat[i][j] >= tar) {
                    j--;
                } 
                else {
                    i++;
                }
            }
        }
        
        System.out.println(false);
	}

}
