package graphs;

import java.util.*;

public class UnitArea {
	
public static void main (String[] args) {
		
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-->0) {
            
        	int m = sc.nextInt();
        	int n = sc.nextInt();
        	int mat[][] = new int[m][n];
        	
        	for(int i=0; i<m; i++) {
        	    for(int j=0; j<n; j++) {
        	        mat[i][j] = sc.nextInt();
        	    }
        	}
        	
            int max = 0;
    	    int count[] = new int[1];
    	    
    	    for(int i=0; i<m; i++) {
    	        for(int j=0; j<n; j++) {
    	            count[0] = 0;
    	            if(mat[i][j] == 1) {
    	                dfs(mat, i, j, count);
    	            }
    	             max = Math.max(max, count[0]);
    	        }
    	    }
    	        System.out.println(max);
	    }
	
	}
	
	public static void dfs(int mat[][], int i, int j, int ans[]){
	    if(i<0 || i>=mat.length || j<0 || j>=mat[0].length || mat[i][j]==0) {
	        return;
	    }
	    if(mat[i][j] == 1) {
	        ans[0]++;
	    }
	    
	    mat[i][j] = 0;
	    dfs(mat, i+1, j, ans);
	    dfs(mat, i-1, j, ans);
	    dfs(mat, i, j+1, ans);
	    dfs(mat, i, j-1, ans);
	    
	    dfs(mat, i+1, j+1, ans);
	    dfs(mat, i+1, j-1, ans);
	    dfs(mat, i-1, j+1, ans);
	    dfs(mat, i-1, j-1, ans);
	    
	}
}
