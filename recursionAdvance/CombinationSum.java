package recursionAdvance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CombinationSum {

	public static void main(String[] args) throws IOException {
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 int t = Integer.parseInt(br.readLine());
	   	 while(t-->0) {
	   	     int n = Integer.parseInt(br.readLine());
	   	     ArrayList<Integer> ll = new ArrayList<>();
	   	     String str[] = br.readLine().split(" ");
	   	     for(int i=0; i<n; i++) {
	   	    	 if(ll.contains(Integer.parseInt(str[i]))) {
	   	    		 Integer.parseInt(str[i]);
	   	    	 }
	   	    	 else {
	   	    		ll.add(Integer.parseInt(str[i])); 
	   	    	 }
	   	     }
	   	     int b = Integer.parseInt(br.readLine());
	   	  
	   	     Collections.sort(ll);
	   	     
	   	     List<List<Integer>> results = new ArrayList<>();
	   	     List<Integer> combo = new ArrayList<>();
	   	     
	   	     findCombinations(results, combo, ll, b, 0, 0);
	   	     StringBuffer sb = new StringBuffer();
	   	     
	   	     if(results.size() == 0) {
				sb.append("Empty");
				System.out.println(sb);
	   	     }
	   	     else {
				for(int i=0; i<results.size(); i++) {
					sb.append("(");
					for(int j=0; j<results.get(i).size(); j++) {
						sb.append(results.get(i).get(j));
						if(j != results.get(i).size() -1) {
							sb.append(" ");
						}
					}
					sb.append(")");		
				}
					System.out.print(sb);	
			}
	   	 }
	}
		 public static void findCombinations(List<List<Integer>> results, List<Integer>combo, List<Integer>ll, int sum, int startIndex, int initalSum) {
			if(initalSum == sum) {
				results.add(new ArrayList<>(combo));
				return;
			}
			for(int i=startIndex; i<ll.size(); i++) {
				if(ll.get(i)+initalSum <= sum) {
					combo.add(ll.get(i));
					findCombinations(results, combo, ll, sum, i, initalSum+ll.get(i));
					combo.remove(combo.size() - 1);
				}
			}	 
		 }
}
