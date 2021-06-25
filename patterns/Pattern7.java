package patterns;
import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
        int k;
		int number = 1;
		for(int i=1;i<=n;i++) {							// if k = 0 -> false										
				k=1;									// if k = 1 -> true
			for(int j=1;j<=n;j++) {						// if j = 3 then k = 1  while if j = 4 then k = 0 :: for i = 3 (k ki value toggle ho rhi h)
				
				if(j>=n-i+1 && j<=n+i-1 && k>-1) {
					System.out.print(number +" ");
					number++;           					//number++ will increase the value of number by 1 
					k=0;
							}
				else {
					System.out.print(" ");
					k=1;
							}
			}
			System.out.println();

	}

}
	
}