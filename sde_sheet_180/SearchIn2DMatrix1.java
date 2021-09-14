package sde_sheet_180;
import java.util.*;

public class SearchIn2DMatrix1 {

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
		
		int reqRow = 0;
		
        for(int i=0; i<n; i++) {
            if(mat[i][m-1] >= tar) {
                reqRow = i;
                break;
            }
        }
        
        for(int j=0; j<m; j++) {
            if(mat[reqRow][j] == tar) {
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
        
	}

}
