package whileloops;
import java.util.Scanner;

public class Numberofdigits {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
				
			int n = sc.nextInt();
				
			int numberofdigits =  (int) (Math.log10(n) + 1);
				
				System.out.println("number of digits "+numberofdigits);
			




	}

}
