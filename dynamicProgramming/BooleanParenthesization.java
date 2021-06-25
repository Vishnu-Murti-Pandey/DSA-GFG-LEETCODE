package dynamicProgramming;
import java.util.*;

public class BooleanParenthesization {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = str.length();
		
		String str1 = "";
		String str2 = "";
		for(int i=0; i<n; i++) {
			if(i%2 == 0) {
				str1 = str1 + str.charAt(i);
			}
			else {
				str2 = str2 + str.charAt(i);
			}
		}
		
		int ans = solveTab(str1, str2, str1.length());

		System.out.println(ans);
	}
	
	public static int solveTab(String str1, String str2, int n) {
		
		int dpt[][] = new int[n][n];
		int dpf[][] = new int[n][n];
		
		for(int gap=0; gap<n; gap++) {
			for(int i=0,j=gap; j<n; i++,j++) {
				
				if(gap == 0 ) {
					char ch = str1.charAt(i);
					if(ch == 'T') {
						dpt[i][j] = 1;
					}
					else {
						dpf[i][j] = 1;
					}
				}
				else {
					
					for(int k=i; k<j; k++) {
						char oprtr = str2.charAt(k);
						
						int lt = dpt[i][k];
						int rt = dpt[k+1][j];
						int lf = dpf[i][k];
						int rf = dpf[k+1][j];
						
						if(oprtr == '&') {
							dpt[i][j] += lt*rt; 
							dpf[i][j] += lt*rf + lf*rt + lf*rf;
						}
						else if(oprtr == '|') {
							dpt[i][j] += lt*rf + lf*rt + lt*rt;
							dpf[i][j] += lf*rf; 
						}
						else {
							dpt[i][j] += lt*rf + lf*rt;
							dpf[i][j] += lt*rt + lf*rf;
						}
						
					}
					
				}
				
			}
		}
		
		return dpt[0][n-1];
	}

}
