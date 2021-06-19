package codechef;
import java.util.*;

public class EvenDifferences {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-->0) {
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i=0; i<n; i++) {
		        arr[i] = sc.nextInt();
		    }
		    
		    solve(arr, n);
		}

	}
	
	public static void solve(int arr[], int n) {
	    
		   boolean allOdd = true;
		   boolean allEven = true;
		   int odd = 0;
		   int even = 0;
		   
		   for(int i=0; i<n; i++) {
		       if(arr[i]%2 == 0) {
		           allOdd = false;
		           even++;
		       }
		       else {
		           odd++;
		           allEven = false;
		       }
		   }
		   if(allOdd) {
		       System.out.println(0);
		   }
		   else if(allEven) {
		       System.out.println(0);
		   }
		   else {
		       if(odd > even) {
		           System.out.println(odd);
		       }
		       else if(odd < even) {
		           System.out.println(even);
		       }
		       else {
		           System.out.println(odd);
		       }
		   }
		    
		}

}
