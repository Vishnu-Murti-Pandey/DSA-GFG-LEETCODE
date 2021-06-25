package greedyAlgorithms;

import java.util.Scanner;

public class MinimumCostMoveChipsToTheSamePosition {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int position[] = new int[n];
		for(int i=0; i<n; i++) {
			position[i] = sc.nextInt();
		}
        
        int odd = 0;
        int even = 0;
        
        for(int i=0; i<position.length; i++) {
            if(position[i]%2 == 0) {
                even++;
            }
            else {
                odd++;
            }
        }
        
        System.out.println(Math.min(even, odd));

	}

}
