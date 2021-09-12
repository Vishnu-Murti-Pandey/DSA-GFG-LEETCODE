package sde_sheet_180;

import java.util.*;

public class SetMatrixZeroes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int mat[][] = new int[m][n];
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				mat[i][j] = sc.nextInt(); 
			}
		}
		
		//bruteForce(mat, m, n);
		
		optimalSolution(mat, m, n);
		
		for(int i=0; i<m; i++) {
        	for(int j=0; j<n; j++) {
        		System.out.print(mat[i][j]+" ");
        	}
        	System.out.println();
        }

	}
	
	private static void optimalSolution(int[][] mat, int m, int n) {
	    
        boolean fr = false;
        boolean fc = false;
        
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(mat[i][j] == 0) {
                    if(i == 0) {
                        fr = true;
                    }
                    if(j == 0) {
                        fc = true;
                    }
                    mat[i][0] = 0;
                    mat[0][j] = 0;
                }
            }
        }
        
        for(int i=1; i<m; i++) {
            for(int j=1; j<n; j++) {
                if(mat[i][0]==0 || mat[0][j]==0) {
                    mat[i][j] = 0;
                }
            }
        }
        
        if(fr) {
            for(int j=0; j<n; j++) {
                mat[0][j] = 0;
            }
        }
        
        if(fc) {
            for(int i=0; i<m; i++) {
                mat[i][0] = 0;
            }
        }
		
	}

	private static void bruteForce(int mat[][], int m, int n) {
		
		ArrayList<Pair> alp = new ArrayList<>();
        
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(mat[i][j] == 0) {
                    Pair p = new Pair(i, j);
                    alp.add(p);
                }
            }
        }
        
        while(!alp.isEmpty()) {
            Pair p = alp.remove(0);
            int x = p.x;
            int y = p.y;
            
            for(int i=0; i<m; i++) {
                for(int j=0; j<n; j++) {  
                    if(i==x || j==y) {
                        mat[i][j] = 0;
                    }
                }
            }
            
        }
		
	}

}

class Pair {
    int x;
    int y;
    
    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
