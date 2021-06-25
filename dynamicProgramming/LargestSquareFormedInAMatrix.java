package dynamicProgramming;
import java.util.*;

public class LargestSquareFormedInAMatrix {

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
		
		int dp[][] = new int[n][m];
        int maxSize = Integer.MIN_VALUE;;
        
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                
                if(i == 0 || j == 0) {
                    dp[i][j] = mat[i][j];
                    maxSize = Math.max(maxSize, dp[i][j]);
                }
                else {
                    if(mat[i][j] != 0) {
                        dp[i][j] = 1 + Math.min(dp[i-1][j-1], Math.min(dp[i-1][j], dp[i][j-1]));
                        maxSize = Math.max(maxSize, dp[i][j]);
                    }
                }
                
            }
        }
        
        System.out.println(maxSize);
		
	}

}
