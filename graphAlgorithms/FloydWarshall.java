package graphAlgorithms;

import java.util.*;

public class FloydWarshall {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int vtces = sc.nextInt();
		int graph[][] = new int[vtces][vtces];
		
		for(int i=0; i<vtces; i++) {
			for(int j=0; j<vtces; j++) {
				graph[i][j] = sc.nextInt();
			}
		}
		solve(graph, graph, vtces);
		
	}
	
	public static void solve(int graph[][], int dist[][], int vtces) {
		
		for(int k=0; k<vtces; k++) {
			for(int i=0; i<vtces; i++) { 
				for(int j=0; j<vtces; j++) {
					
					if(dist[i][k]==Integer.MAX_VALUE || dist[k][j]==Integer.MAX_VALUE) {
						continue;
					}
					else if(dist[i][k]+dist[k][j] < dist[i][j]) {
						dist[i][j] = dist[i][k]+dist[k][j]; 
					}
					
				}
			}
		}
		
		for(int i=0; i<vtces; i++) {
			for(int j=0; j<vtces; j++) {
				if(dist[i][j] == Integer.MAX_VALUE) {
					System.out.print("INF ");
				}
				else {
					System.out.print(dist[i][j]+" ");
				}
			}
			System.out.println();
		}
	}

}
