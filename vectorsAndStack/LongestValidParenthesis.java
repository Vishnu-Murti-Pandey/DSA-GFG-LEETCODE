package vectorsAndStack;

import java.util.Scanner;
import java.util.Stack;

public class LongestValidParenthesis {

	public static void main(String[] args) {
		

		 Scanner sc = new Scanner(System.in);
		    int t = sc.nextInt();
		    
		    Stack<Integer> s = new Stack<>();
		    s.push(-1);
		    while(t-->0) {
			    int count = 0;
		    	String str = sc.next();
		        for(int i=0; i<str.length(); i++) {
		            if(str.charAt(i) == '('){
		                s.push(i);
		            }
		            
		            else {
		                s.pop();                
		                if(!s.empty()) {
		                	count = Math.max(count, i - s.peek());
		                }
		                else {
		                	s.push(i);
		                }
		            }
		           
		        }
		        System.out.println(count);
		    }	

	}

}
