package sildingWindow;
import java.util.*;

public class CountOccuranceOfAnagram {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    
	    while(t-->0) {
	        String s = sc.next();	        
	        String c = sc.next();
	        
	        int a[] = new int[s.length()];
	        for(int i=0; i<s.length(); i++) {
	        	a[i] = s.charAt(i);
	        }
	        
	        int b[] = new int[c.length()];
	        for(int i=0; i<c.length(); i++) {
	        	b[i] = c.charAt(i);
	        }
	        
	        int count = 0;
	    for(int k=0; k<s.length(); k++) {
	        for(int i=0; i<c.length(); i++) {
	        	for(int j=0; j<c.length(); j++) {
	        		if(a[i] == b[j]) {
	        			count++;
	        			break;
	        		}	        		
	        	}	        	
	        }
	        count = count - c.length() + 1;	        	        
	    	}    	        
	    }

	}

}
