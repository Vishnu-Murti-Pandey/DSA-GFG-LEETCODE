package loops;
import java.util.Scanner;

public class Power {
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter the value of x ");
	int x = sc.nextInt();
	
	System.out.println("enter the value of y ");
	int y = sc.nextInt();
	
	int result = 1;
	int i;
	
	for(i=1;i<=y;i++) {
		
		result = x*result;
		
	}
	
	System.out.println("the required answer is "+ result);
	
	
}
	
	
}