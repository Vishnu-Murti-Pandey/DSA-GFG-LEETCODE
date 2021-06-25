package greedyAlgorithms;

import java.util.PriorityQueue;
import java.util.Scanner;

public class LastStoneWeight {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int stones[] = new int[n];
		for(int i=0; i<n; i++) {
			stones[i] = sc.nextInt();
		}
		
		PriorityQueue<Integer> pq = new PriorityQueue<>((a, b)-> b - a);
        
        for(int i=0; i<stones.length; i++) {
            pq.add(stones[i]);
        }
        
        while(pq.size() > 1) {
            int x = pq.poll();
            int y = pq.poll();
            
            if(x != y) {
                pq.add(x - y);
            }
        }
        
        if(pq.isEmpty()) {
            System.out.println(0);
        }
        else {
        	System.out.println(pq.poll());
        }
		
	}

}
