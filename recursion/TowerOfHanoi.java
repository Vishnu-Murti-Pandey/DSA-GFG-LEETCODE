package recursion;
import java.util.Scanner;

public class TowerOfHanoi {

	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		solve(n, 1, 2, 3);

	}
	public static void solve(int n, int i, int k, int j) {
		if(n == 1) {
			System.out.println("move from "+i +" to "+ k);
			return;
		}
		solve(n-1, i, j, k);
		System.out.println("move from "+i +" to "+ k);
		solve(n-1, j, i, k);
		return;
	}

}
