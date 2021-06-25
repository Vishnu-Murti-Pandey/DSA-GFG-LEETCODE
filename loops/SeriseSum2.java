package loops;
import java.util.Scanner;

public class SeriseSum2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);                  // question is ->  1-1/2+1/3-1/4+............1/n == log e 2
		
		System.out.println("enter the value of n ");
		float n = sc.nextFloat();
		
		float i;
		float result = 0;
		
		for(i=1;i<=n;i++) {
			 
			if(i%2==0) {
				result =  result - 1/i;
					}
			else
				result = result + 1/i;
		}
		System.out.println(result);

	}

}
