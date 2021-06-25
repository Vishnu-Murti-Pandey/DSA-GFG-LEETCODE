package loops;
import java.util.Scanner;

public class SeriseSum {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);                       // question is -> 1+1/2+1/3+1/4+.......+1/n 
	
	System.out.println("enter the value of n");
	float n = sc.nextFloat();
	
	float i;
	float result =0;
	
	for(i=1;i<=n;i++) {
		result += 1/i;
		
		}
	System.out.println("required answer is " +result);
	}

}
