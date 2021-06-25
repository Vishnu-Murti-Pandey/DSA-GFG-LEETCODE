package recursion;
import java.util.*;

public class SubsetOfString {
	
	static Set<String> set = new HashSet<>();
	static ArrayList<String> al = new ArrayList<>();
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String out = "";
		solve(s, out);
		for(String x: set) {
    		al.add(x);
    	}
    	Collections.sort(al);
		System.out.println(al);

	}
	public static void solve(String inp, String out) {
        if(inp.length() == 0) {
        	set.add(out);
            return;
        }
        String op1 = out;
        String op2 = out;
        op2 = op2 + inp.substring(0, 1);
        inp = inp.substring(1);
        solve(inp, op1);
        solve(inp, op2);
        return;
        
    }
	
}
