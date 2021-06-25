package dynamicProgramming;
import java.util.*;

public class CountOccurencesOfGivenWordIn2DArray {
	
	static int dx[] = {1, 0, -1, 0};
    static int dy[] = {0, 1, 0, -1}; 
    static int count = 0;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char mat[][] = new char[n][m];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				mat[i][j] = sc.next().charAt(0);
			}
		}
		String target = sc.next();
		
		int ans = findOccurrence(mat, target);
		System.out.println(ans);
	
	}
	
	public static int findOccurrence(char mat[][], String tar) {
        
        int n = mat.length;
        int m = mat[0].length;
        
        count = 0;
        
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(tar.charAt(0) == mat[i][j]) {
                    solve(mat, i, j, n, m, tar);
                }
            }
        }
        
        return count;    
    }
    
    public static void solve(char mat[][], int i, int j, int n, int m, String tar) {
        
        if(!isSafe(i, j, n, m)) {
            return;
        }
        if(mat[i][j] == tar.charAt(0)) {
        	String rem = tar.substring(1);
        	if(rem.equals("")) {
        		count++;
        		return;
        	}
        	else {
		        for(int k=0; k<4; k++) {
		            int x = i + dx[k];
		            int y = j + dy[k];
		            
		            solve(mat, x, y, n, m, rem);
		        }
        	}
        }
        else {
        	return;
        }
    }
    
    public static boolean isSafe(int i, int j, int n, int m) {
        if(i>=0 && j>=0 && i<n && j<m) {
            return true;
        }
        return false;
    }
	

}
