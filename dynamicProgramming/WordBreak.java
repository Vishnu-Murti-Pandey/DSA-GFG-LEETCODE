package dynamicProgramming;
import java.util.*;

public class WordBreak {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		ArrayList<String> al = new ArrayList<>(n);
		for(int i=0; i<n; i++) {
			al.add(sc.next());
		}
		String str = sc.next();
		
		int ans = solve(al, str);
		System.out.println(ans);

	}
	
	public static int solve(ArrayList<String> B, String A) {
		
		HashSet<String> set = new HashSet<>();
        
        for(int i=0; i<B.size(); i++) {
            set.add(B.get(i));
        }
        int n = A.length();
        
        int dp[] = new int[n];
        
        for(int i=0; i<dp.length; i++) {
            for(int j=0; j<=i; j++) {
                String str = A.substring(j, i+1);
                if(set.contains(str)) {
                    if(j > 0) {
                        dp[i] = dp[i] + dp[j-1];
                    }
                    else {
                        dp[i] = dp[i] + 1;
                    }
                }
            }
        }
        
        return dp[n-1] > 0? 1:0;
		
	}

}
