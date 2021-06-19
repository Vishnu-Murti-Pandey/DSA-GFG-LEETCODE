package conditionalStatements;
import java.util.Scanner;

public class IfClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int age = sc.nextInt();
		
		if(age >= 18) {
			System.out.println("You can vote");
			}
		else {
			System.out.println("you can't vote");
		}
		
	}
		
}
