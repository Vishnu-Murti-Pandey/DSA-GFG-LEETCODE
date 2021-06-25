package recursionAdvance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CombinationSum2 {

	public static void main (String[] args) throws IOException {
	   	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   	 	int t = Integer.parseInt(br.readLine());
   	 	while(t-->0) {
   	 		int n = Integer.parseInt(br.readLine());
   	 		String str[] = br.readLine().split(" ");
   	 		List<Integer> ll = new ArrayList<>();
   	 		
   	 		for(int i=0; i<n; i++) {
   	 			ll.add(Integer.parseInt(str[i]));
   	 		}
   	 		Collections.sort(ll); 
   	 		int b = Integer.parseInt(br.readLine());
   	 		
   	 		List<List<Integer>> ans = new ArrayList<>();
   	 		List<Integer> combo = new ArrayList<>();
   	 		Set<List<Integer>> set = new HashSet();
   	     
   	 		solve(ans, combo, ll, b, 0, 0, set);
   	 		
   	 		StringBuffer sb = new StringBuffer();
   	 		
   	 		if(ans.size() == 0) {
   	 			sb.append("Empty");
   	 			System.out.println(sb);
   	 			continue;
   	 		}
   	 		for(int i=0; i<ans.size(); i++) {
   	 			sb.append("(");
   	 			for(int j=0; j<ans.get(i).size(); j++) {
   	 				sb.append(ans.get(i).get(j));
   	 				if(j != ans.get(i).size()-1) {
   	 					sb.append(" ");
   	 				}
   	 			}
   	 				 sb.append(")");
   	 		}
   	 		System.out.println(sb);
   	 	}	
	}
	
	public static void solve(List<List<Integer>> ans, List<Integer> combo, List<Integer> ll, int target, int startIndex, int sum,
	Set<List<Integer>> set) {
		
		if(sum == target) {
			if(!set.contains(combo)) {
				ans.add(new ArrayList<>(combo));
				set.add(combo);
			}
			
			return;
		}
		for(int i=startIndex; i<ll.size(); i++) {
			if(sum + ll.get(i) <= target) {
				combo.add(ll.get(i));
				solve(ans, combo, ll, target, i+1, sum+ll.get(i), set);
				combo.remove(combo.size()-1);
			}
		}
	}
}
