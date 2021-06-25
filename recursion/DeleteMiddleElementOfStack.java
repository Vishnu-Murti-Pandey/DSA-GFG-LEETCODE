package recursion;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class DeleteMiddleElementOfStack {

static ArrayList<Integer> al = new ArrayList<>();
	
	public static void main(String[] args)  {
	
		Scanner sc = new Scanner(System.in);
	    	Stack<Integer> s = new Stack<>();
	    	
	    	int n = sc.nextInt();
	    	for(int i=0; i<n; i++) {
	    		s.add(sc.nextInt());
	    	}
	    	Stack<Integer> ans = middle(s, (n/2)+1, 1);
	    	System.out.println(ans.toString());
	
		}

	public static Stack<Integer> middle(Stack<Integer> st, int size, int i) {	
		if(i == size) {
			st.pop();
			for(int j=al.size()-1; j>=0; j--) {
				st.add(al.get(j));
			}
			return st;
		}
		int temp = st.pop();
		al.add(temp);
		return middle(st, size, i+1);
		   
	}

}
