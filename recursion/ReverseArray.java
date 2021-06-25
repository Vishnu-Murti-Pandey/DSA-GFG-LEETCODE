package recursion;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t-->0) {
	    	int n = sc.nextInt();
	    	int a[] = new int[n];
	    	for(int i=0; i<n; i++) {
	    		a[i] = sc.nextInt();
	    	}
	    	int rev[] = revArray(a,0,n-1);
	    	for(int x: rev) {
	    		System.out.print(x+" ");
	    	}
	    	
	    }
	}
	static int[] revArray(int a[], int i, int j) {
		if(i<j) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			return revArray(a,i+1,j-1);
		}
		return a;
	}
}
