package codechef;

import java.util.Scanner;

public class EquinoxStrings {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		
		while(t-->0) {
	        int n = s.nextInt();
	        int a = s.nextInt();
	        int b = s.nextInt();
	        
	        int boy = 0;
	        int girl = 0;
	        
	        for(int i=0; i<n; i++) {
	        	String str = s.next();
		            
		        char ch = str.charAt(0);
	            if(ch=='E'||ch=='Q'||ch=='U'||ch=='I'||ch=='N'||ch=='O'||ch=='X') {
	            	boy = boy + a;
	            }
	            else {
	                girl = girl + b;
	            }
	        }
	        
	        if(boy>girl) {
	            System.out.println("SARTHAK");
	        }
	        else if(girl>boy) {
	            System.out.println("ANURADHA");
	        }
	        else {
	            System.out.println("DRAW");
	        }
	        
	    }

	}

}
