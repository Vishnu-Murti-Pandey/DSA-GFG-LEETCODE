package vectorsAndStack;

import java.util.Scanner;
import java.util.Stack;

public class CountTheReversal {

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
    	 int t = sc.nextInt();
    	 
    	 while(t-->0) {
    		 Stack<Character> s = new Stack<>();
    	     String str = sc.next();
    	     if(str.length() % 2 == 0) {
    	    	 double m = 0 , n = 0;
    	         for(int i=0; i<str.length(); i++) {
    	           char ch = str.charAt(i);
    	           if(ch == '{') {
    	               s.push(ch);
    	               m++;
    	           }
    	           else {
    	               if(s.empty()) {
    	                   n++;
    	               }
    	               else {
    	                   s.pop();
    	                   m--;
    	               }
    	           }
    	        }
    	        double temp = Math.ceil(m/2) + Math.ceil(n/2);
    	        int flag = (int) temp; 
    	        System.out.println(flag);
    	     }
    	     else {
    	         System.out.println(-1);
    	     }   	     
    	 }
	}
}
