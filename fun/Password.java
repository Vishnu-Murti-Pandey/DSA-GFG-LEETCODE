package fun;

import java.util.*;

public class Password {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-->0) {
            String str = sc.next();
            
            String ans = solve(str);
            System.out.println(ans);
        }

	}
	
	public static String solve(String str) {
	    if(str.length()<10) {
	        return "NO";
	    }
	    boolean isLower = false;
	    boolean isUpper = false;
	    boolean isDigit = false;
	    boolean isSpecial = false;
	    
	    for(int i=0; i<str.length(); i++) {
	        char ch = str.charAt(i);    
	        
	        if(Character.isUpperCase(ch) && i!=0 && i!=str.length()-1) {
	            isUpper = true;
	        }
	        else if(Character.isLowerCase(ch)) {
	            isLower = true;
	        }
	        else if(Character.isDigit(ch) && i!=0 && i!=str.length()-1) {
	            isDigit = true;
	        }
	        else if((ch=='@' || ch=='#' || ch=='%' || ch=='&' || ch=='?') && i!=0 && i!=str.length()-1) {
	            isSpecial = true;
	        }     
	    }
	    if(isLower && isUpper && isDigit && isSpecial) {
	        return "YES";
	    }
	    return "NO";
	}

}
