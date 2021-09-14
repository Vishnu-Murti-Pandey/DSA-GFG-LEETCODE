package sde_sheet_180;

import java.util.Scanner;

public class RotateImage {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int mat[][] = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		int k = 0;
        
        while(k < n) {
            int xi = k;
            int xj = k;
            int yi = k;
            int yj = k;
            while(xj<n && yi<n) {
                int x = mat[xi][xj];
                int y = mat[yi][yj];
                int temp = x;
                x = y;
                y = temp;
                mat[xi][xj] = x;
                mat[yi][yj] = y;
                xj++;
                yi++;
            }
            k++;
        }
        
        for(int i=0; i<mat.length; i++) {
            int x = 0;
            int y = mat.length-1;
            while(x < y) {
                int a = mat[i][x];
                int b = mat[i][y];
                int temp = a;
                a = b;
                b = temp;
                mat[i][x] = a;
                mat[i][y] = b;
                x++;
                y--;
            }
        }
        
        for(int i=0; i<n; i++) {
        	for(int j=0; j<n; j++) {
        		System.out.print(mat[i][j]+" ");
        	}
        	System.out.println();
        }

	}

}
