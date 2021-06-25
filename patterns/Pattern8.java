package patterns;
import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = 0;
		
		for(int i=1;i<=n;i++) {
			if (i==4)
				 i=k++;
			else
				  i=k--;
			for(int j=1;j<=n-2;j++) {
				
				if(j<=k)
					System.out.print("* ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
