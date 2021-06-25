package graphs;
import java.io.*;
import java.util.*;

public class WordBoggle {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        while(t-->0) {
        	int n = Integer.parseInt(br.readLine());
        	
        	String dict[] = new String[n];
            String str1[] = br.readLine().split(" ");
            for(int i=0; i<n; i++) {
                dict[i] = str1[i];
            }
            
            String str2[] = br.readLine().split(" ");
            int a = Integer.parseInt(str2[0]);
            int b = Integer.parseInt(str2[1]);
            
            String str3[] = br.readLine().split(" ");
            char boggle[][] = new char[a][b];
            int k = 0;
            for(int i=0; i<a; i++) {
                for(int j=0; j<b; j++) {
                    boggle[i][j] = str3[k++].charAt(0);                  
                }
            }
            
            TreeSet<String> ans = new TreeSet<>();
            
            for(int r=0; r<n; r++) {
            	
            	for(int i=0; i<a; i++) {
            		for(int j=0; j<b; j++) {
            			if(dict[r].charAt(0) == boggle[i][j]) {
            				if(solve(i, j, boggle, dict[r], 0) ) {
            					ans.add(dict[r]);
            				}
            			}
            		}
            	}
            }
            
            if(ans.isEmpty()) {
            	System.out.print(-1);
            }
            else {
            	for(String str: ans) {
            		System.out.print(str+" ");
            	}
            }
            System.out.println();
        }
	}
	
	public static boolean solve(int i, int j, char[][] boggle, String inp, int k) {
		if(k == inp.length()) {
			return true;
		}
		if(i<0 || j<0 || i>=boggle.length || j>=boggle[0].length) {
			return false;
		}
		if(boggle[i][j] != inp.charAt(k)) {
			return false;
		}
		
		char ch = boggle[i][j];
		boggle[i][j] = '$';
		
		boolean a = solve(i+1, j, boggle, inp, k+1);
		boolean b = solve(i, j-1, boggle, inp, k+1);
		boolean c = solve(i-1, j, boggle, inp, k+1);
		boolean d = solve(i, j+1, boggle, inp, k+1);
		
		boolean e = solve(i+1, j+1, boggle, inp, k+1);
		boolean f = solve(i+1, j-1, boggle, inp, k+1);
		boolean g = solve(i-1, j-1, boggle, inp, k+1);
		boolean h = solve(i-1, j+1, boggle, inp, k+1);
		
		boggle[i][j] = ch;
		
		if(a || b || c || d || e || f || g || h) {
			return true;
		}
		return false;
	}
}
