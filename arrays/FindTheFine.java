package arrays;
import java.util.*;

public class FindTheFine {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int d = sc.nextInt();
		
		int c[] = new int [n];
		for(int i=0; i<n; i++) {
			c[i] = sc.nextInt();
			
		}
		
		int p[] = new int[n];
		for(int i=0; i<n; i++) {
			p[i] = sc.nextInt();
			
		}
		int temp = 0 ;
		
		for(int i=0; i<n; i++) {
			if(d%2 == 0) {
				if(c[i]%2 == 0)
					continue;
				else
					temp = temp + p[i];
			}
			else {
				if(c[i]%2 == 0)
					temp = temp + p[i];
				else
					continue;
			}
		}
		System.out.println(temp);
				
	}

}
