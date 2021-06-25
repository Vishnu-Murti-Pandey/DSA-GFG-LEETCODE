package simpleIntrest;
import java.util.Scanner;

public class SimpleIntrest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int p = sc.nextInt();
		float r = sc.nextFloat();
		float t = sc.nextFloat();
		
		float SI = p*r*t/100 ;
		
		System.out.println("The Simple Interst Is "+SI);
		
		

	}

}
