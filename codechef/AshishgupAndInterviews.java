package codechef;

import java.util.Scanner;

public class AshishgupAndInterviews {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-->0) {
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i=0; i<n; i++) {
		        arr[i] = sc.nextInt();
		    }
		    
		    int solved = 0;
		    int mttsop = 0;
		    boolean bot = true;
		    
		    for(int i=0; i<n; i++) {
		    	if(arr[i] != -1) {
		    		solved++;
		    	}
		        if(arr[i]>k) {
		            mttsop++;
		        }
		        if(arr[i]>1 || arr[i]==-1) {
		            bot = false;
		        }
		    }
		    int ceil = (int)Math.ceil(n*1.0/2*1.0);
		    if(solved<ceil) {
		        System.out.println("Rejected");
		    }
		    else if(mttsop>0) {
		        System.out.println("Too Slow");
		    }
		    else if(bot) {
		        System.out.println("Bot");
		    }
		    else {
		        System.out.println("Accepted");
		    }
		    
		    
		}

	}

}
