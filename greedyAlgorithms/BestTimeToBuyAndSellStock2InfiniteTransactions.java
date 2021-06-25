package greedyAlgorithms;
import java.util.*;

public class BestTimeToBuyAndSellStock2InfiniteTransactions {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int prices[] = new int[n];
		for(int i=0; i<n; i++) {
			prices[i] = sc.nextInt();
		}
		
		int total = 0;
        
		// peak and valley approach 
		// calculate all the up strokes);
		
        for(int i=0; i<prices.length-1; i++) {
            
            if(prices[i]<prices[i+1]) {
                total = total + prices[i+1] - prices[i];
            }
             
        }
        
        System.out.println(total);
			
	}

}
