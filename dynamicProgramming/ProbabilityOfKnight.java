package dynamicProgramming;
import java.util.*;

public class ProbabilityOfKnight {
	
	static int dx[] = {-1, -2, -2, -1, 1, 2, 2, 1};
	static int dy[] = {-2, -1, 1, 2, 2, 1, -1, -2,};
	
	public static boolean isValid(int nx, int ny, int n) {
		if(nx>=0 && ny>=0 && nx<n && ny<n) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int k = sc.nextInt();
		
		double curr[][] = new double[n][n];
		double next[][] = new double[n][n];
		
		curr[x][y] = 1;
		
		for(int m=0; m<k; m++) {
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					
					if(curr[i][j] != 0) {
						for(int c=0; c<8; c++) {
							int nx = i+dx[c];
							int ny = j+dy[c];
							if(isValid(nx, ny, n)) {
								double prob = curr[i][j]/8.0;
								next[nx][ny] = next[nx][ny] + prob;
							}
						}
					}
					
				}
			}
			curr = next;
			next = new double[n][n];
		}
		
		double sum = 0;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				sum = sum + curr[i][j];
			}
		}
		System.out.println(sum);

	}

}
