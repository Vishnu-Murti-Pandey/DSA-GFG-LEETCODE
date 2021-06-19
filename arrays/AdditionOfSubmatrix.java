package arrays;
import java.util.Scanner;

public class AdditionOfSubmatrix {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder ans = new StringBuilder();
		
	        int m = sc.nextInt();
	        int n = sc.nextInt();
	        
	        int a[][] = new int[m+1][n+1];
	        
	       
	        for(int i=1; i<=m; i++){
	            for(int j=1; j<=n; j++){
	                a[i][j] = sc.nextInt();
	            }
	        }
	        int x1 = sc.nextInt();
	        int y1 = sc.nextInt();
	        int x2 = sc.nextInt();
	        int y2 = sc.nextInt();
	        
	        int sum = 0;
            for(int i=x1; i<=x2; i++){
                for(int j=y1; j<=y2; j++){
                    sum += a[i][j];
                }
            }
            
            ans.append(sum).append("\n");
  
            System.out.print(ans);
	       
	}

}
