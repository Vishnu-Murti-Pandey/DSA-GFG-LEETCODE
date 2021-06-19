package codechef;

import java.util.ArrayList;
import java.util.Scanner;

public class CodeX1 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String A[] = new String[n];
		for(int i=0; i<n; i++) {
			A[i] = sc.next();
		}
		String B = sc.next();
		int q = sc.nextInt();
		int C[][] = new int[q][2];
		for(int i=0; i<q; i++) {
			for(int j=0; j<2; j++) {
				C[i][j] = sc.nextInt();
			}
		}
		
		String res[] = solve(A, B, C);
		
		for(String s: res) {
			System.out.print(s +" ");
		}
		
	}
	

	public static String[] solve(String[] A, String B, int[][] C) {
        
		ArrayList<Integer> holdString = new ArrayList<>();
		ArrayList<Integer> holdChar = new ArrayList<>();
		
        for(int i=0; i<A.length; i++) {
            String str = A[i];
            int countch = 0;
            int countss = 1;
            int max = 0;
            for(int j=0; j<str.length()-1; j++) {
                int ch1 = (int)str.charAt(j);
                int ch2 = (int)str.charAt(j+1);
                if((ch2-ch1) == 1) {
                    countss++;
                }
                else {
                    max = Math.max(countss, max);
                    countss = 1;
                }
                if(str.charAt(j) == B.charAt(0)) {
                    countch++;
                }
            }
            max = Math.max(countss, max);
            if(str.charAt(str.length()-1) == B.charAt(0)) {
            	countch++;
            }
            
            holdString.add(max);
            holdChar.add(countch);
            
        }
        
        String res[] = new String[C.length];
        
        for(int i=0; i<C.length; i++) {
            int x = C[i][0];
            int y = C[i][1];
            boolean found = false;
            int z = 0;
            for(int j=0; j<A.length; j++) {
                int chs = holdString.get(j);
                int chc = holdChar.get(j);
                
                if(chs==x && chc==y) {
                    found = true;
                    break;
                }
                else {
                	z++;
                }
            }
            if(found) {
                res[i] = A[z];
            }
            else {
                res[i] = "NULL";
            }
        }
        return res; 
        
	}

}
