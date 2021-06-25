package dynamicProgramming;
import java.util.*;

public class CountSubsequencesOfTypeAiBjCk {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		long a = 0;
        long ab = 0;
        long abc = 0;
        
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            
            if(ch == 'a') {
                a = (2*a + 1)%1000000007L;
            }
            else if(ch == 'b') {
                ab = (2*ab + a)%1000000007L;
            }
            else {
                abc = (2*abc + ab)%1000000007L; 
            }
            
        }
        
        System.out.println((int)abc);

	}

}
