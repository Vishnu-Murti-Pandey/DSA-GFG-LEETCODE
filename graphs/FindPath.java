package graphs;
import java.util.*;

public class FindPath {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-->0) {
			int n = sc.nextInt();
			
			int mat[][] = new int[n][n];
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					mat[i][j] = sc.nextInt();
				}
			}
			
			int path[] = new int[1];
			boolean found = false;
			
			
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					if(mat[i][j] == 1) {
						dfs(i, j, mat, path);
						found = path[0] == 1?true:false;
					}
					if(found) break;
				}
				if(found) break;
			}
			if(found) {
				System.out.println(1);
			}
			else {
				System.out.println(0);
			}
					
		}
	}
	
	public static void dfs(int i, int j, int mat[][], int path[]) {
		
		if(i<0 || i>=mat.length || j<0  || j>=mat[0].length || mat[i][j] == 0 || path[0] == 1) {
			return;
		}
		if(mat[i][j] == 2) {
			path[0] = 1;
		}
		mat[i][j] = 0;
		dfs(i+1, j, mat, path);
		dfs(i-1, j, mat, path);
		dfs(i, j+1, mat, path);
		dfs(i, j-1, mat, path);
		
	}
}
