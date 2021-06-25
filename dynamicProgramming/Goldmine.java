package dynamicProgramming;
import java.util.*;

public class Goldmine {
	
	//static int totalGold = 0;
	//static int gold = 0;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt(); 
        
        int mine[][] = new int[n][m];
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                mine[i][j] = sc.nextInt();
             }
        } 
        
//        for(int i=0; i<n; i++) {
//        	boolean vis[][] = new boolean[n][m];
//        	solveRec(i, 0, mine, vis);
//        }
//        System.out.println(totalGold);
        
        int ans = solveTab(n, m, mine);
        System.out.println(ans);

	}
	
//	public static void solveRec(int i, int j, int mine[][], boolean vis[][]) {
//		if(i<0 || j<0 || i>mine.length-1 || j>mine[0].length-1 || vis[i][j]) {
//			return;
//		}
//		vis[i][j] = true;
//		gold = gold + mine[i][j];
//		
//		if(j == mine[0].length-1) {
//			System.out.println("Hello "+ gold);
//			totalGold = Math.max(totalGold, gold);
//		}
//		
//		solveRec(i-1, j+1, mine, vis);
//		solveRec(i, j+1, mine, vis);
//		solveRec(i+1, j+1, mine, vis);
//		
//		vis[i][j] = false;
//		gold = gold - mine[i][j];
//		
//	}
	
	public static int solveTab(int n, int m, int mine[][]) {
		
		// for cases like n=1 & m can be anything 1,2,3,4,5.....
		if(n == 1) {
            int lg = 0;
            for(int j=0; j<m; j++) {
                lg = lg + mine[0][j];
            }
            return lg;
        }
		
		
		
		int dp[][] = new int[n][m];
        
        for(int j=m-1; j>=0; j--) {
            for(int i=n-1; i>=0; i--) {
                
                if(j == m-1) {
                    dp[i][j] = mine[i][j];
                }
                
                else if(i == 0) {
                    dp[i][j] = mine[i][j] + Math.max(dp[i][j+1], dp[i+1][j+1]);
                }
                
                else if(i == n-1) {
                    dp[i][j] = mine[i][j] + Math.max(dp[i-1][j+1], dp[i][j+1]);
                }
                
                else {
                    dp[i][j] = mine[i][j] + Math.max(Math.max(dp[i-1][j+1],dp[i][j+1]), dp[i+1][j+1]);
                }
                
            }
        }
        
        for(int i=0; i<n; i++) {
        	for(int j=0; j<m; j++) {
        		System.out.print(dp[i][j]+" ");
        	}
        	System.out.println();
        }
        
        
        int max = Integer.MIN_VALUE;
        for(int i=0; i<dp.length; i++) {
            max = Math.max(max, dp[i][0]); 
        }
        return max;
        
	}

}
