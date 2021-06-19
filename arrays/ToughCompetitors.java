package arrays;
import java.util.*;

public class ToughCompetitors {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		int temp = 0;	int min = 10000;
	    for(int i=0; i<n; i++) {
		    for(int j=i+1; j<n; j++) {
			    temp = Math.abs(a[i] - a[j]);
			    if(temp<min)
			    {
			    min=temp;
			    }
		    }
	    }
	    	System.out.println(min);
      }
		
	}//8661 6623