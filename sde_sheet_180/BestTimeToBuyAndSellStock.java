package sde_sheet_180;

import java.util.Scanner;

public class BestTimeToBuyAndSellStock {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int prices[] = new int[n];
		for(int i=0; i<n; i++) {
			prices[i] = sc.nextInt();
		}
		
		int buy = prices[0];
        int sell = prices[0];
        
        int profit = 0;
        int maxProfit = 0;
        
        for(int i=1; i<prices.length; i++) {
            
            if(buy > prices[i]) {
                buy = prices[i];
                sell = prices[i];
            }
            if(sell < prices[i]) {
                sell = prices[i];
                profit = sell - buy;
            }
            
            maxProfit = Math.max(maxProfit, profit);
        }
        
        System.out.println(maxProfit);

	}

}
