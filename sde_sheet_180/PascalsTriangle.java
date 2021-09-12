package sde_sheet_180;
import java.util.*;

public class PascalsTriangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		List<List<Integer>> ans = solve(n);
		
		for(int i=0; i<ans.size(); i++) {
			List<Integer> al = ans.get(i);
			for(int j=0; j<al.size(); j++) {
				System.out.print(al.get(j)+" ");
			}
			System.out.println();
		}

	}
	
	private static List<List<Integer>> solve(int n) {
		
		List<List<Integer>> ll = new ArrayList<>();
        List<Integer> al = new ArrayList<>();
        
        al.add(1);
        ll.add(al);
        
        if(n == 1) {
            return ll;
        }
        al = new ArrayList<>();
         
           
        for(int i=1; i<n; i++) {
            List<Integer> pl = ll.get(i-1);
            al.add(pl.get(0));
            
            for(int j=0; j<pl.size()-1; j++) {
                int x = pl.get(j);
                int y = pl.get(j+1);
                al.add(x+y);
            }
            
            al.add(pl.get(pl.size()-1));
            
            ll.add(al);
            al = new ArrayList<>();
        }
        
        return ll;
		
	}

}
