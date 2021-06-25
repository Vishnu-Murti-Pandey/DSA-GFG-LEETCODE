package dynamicProgramming;
import java.util.*;

public class BinaryStringWithNoConsecutive0s {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    
	    
//	    with dp Array
//	    int dpz[] = new int[n+1];
//	    int dpo[] = new int[n+1];
//	    
//	    dpz[1] = 1;
//	    dpo[1] = 1;
//	    
//	    for(int i=2; i<n+1; i++) {
//	        dpo[i] = dpz[i-1] + dpo[i-1];
//	        dpz[i] = dpo[i-1];
//	    }
//	    System.out.println(dpz[n]+dpo[n]);
	    
	    
	    int cZeros = 1;
	    int cOnes = 1;
	    
	    for(int i=2; i<n+1; i++) {
	        int tempo = cZeros + cOnes;
	        cZeros = cOnes;
	        cOnes = tempo;
	        
	    }
	    System.out.println(cZeros + cOnes);

	}

}
