package arrays;
import java.util.Arrays;
import java.util.Scanner;

public class PrintAnArrayInPendulumArrangement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		
		StringBuffer sb=new StringBuffer();
	    if(n%2!=0){
	        for(int i=n-1;i>=0;i-=2){
	            sb.append(a[i]+" ");
	        }
	        for(int i=1;i<n-1;i+=2){
	            sb.append(a[i]+" ");
	        }
	    }
	    else{
	       for(int i=n-2;i>=0;i-=2){
	            sb.append(a[i]+" ");
	        }
	        for(int i=1;i<n;i+=2){
	            sb.append(a[i]+" ");
	        } 
	    }
	    System.out.println(sb);
		
	}

}

