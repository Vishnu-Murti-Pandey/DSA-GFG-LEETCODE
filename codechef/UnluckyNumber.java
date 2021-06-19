package codechef;
import java.util.Scanner;

public class UnluckyNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        String ans = "";
        
        while(n > 0) {
            char ch = ((n%2) == 0) ? '3' : '1';
            ans = ch + ans;
            n = (n-1)/2;
        }
        
        System.out.println(ans);

	}

}
