package patterns;
import java.util.Scanner;

public class Pattern1 {
	
	public static void main(String[]  args) {
	
		Scanner sc = new Scanner(System.in);
		
		int i,j;
		int n = sc.nextInt();
		for(i=1;i<=n;i++) {
			for(j=1;j<=n;j++) {
				System.out.print("* ");
				
			}
			
			System.out.println();
		}
		
	}

}
