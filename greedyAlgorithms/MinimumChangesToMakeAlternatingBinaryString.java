package greedyAlgorithms;
import java.util.*;

public class MinimumChangesToMakeAlternatingBinaryString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		int c1 = 0;
        int c2 = 0;
        
        for(int i=0; i<s.length(); i++) {
            
            if(s.charAt(i)=='1' && i%2==0) {
                c1++;
            }
            if(s.charAt(i)=='0' && i%2==1) {
                c1++;
            }
            if(s.charAt(i)=='0' && i%2==0) {
                c2++;
            }
            if(s.charAt(i)=='1' && i%2==1) {
                c2++;
            }
            
        }
        
        System.out.println(Math.min(c1, c2));

	}

}
