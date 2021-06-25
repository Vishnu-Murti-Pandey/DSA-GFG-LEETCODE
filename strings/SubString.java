package strings;
import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		
		int L = sc.nextInt();
		int R = sc.nextInt();
		
		System.out.println(S.substring(L, R));

	}

}
