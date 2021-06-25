package graphAlgorithms;

import java.util.*;

public class TopologicalSort {
	
	static class Edge {
		int src;
		int nbr; 
		
		Edge(int src, int nbr) {
			this.src = src;
			this.nbr = nbr;
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int vtces = sc.nextInt();
		int edges = sc.nextInt();
		
		ArrayList<Edge> graph[] = new ArrayList[vtces];
		for(int i=0; i<vtces; i++) {
			graph[i] = new ArrayList<>();
		}
		for(int i=0; i<edges; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			
			graph[u].add(new Edge(u, v));
			graph[v].add(new Edge(v, u));
		}
		
		boolean vis[] = new boolean[vtces]; 
		Stack<Integer> st = new Stack<>();
		
		for(int i=0; i<vtces; i++) {
			if(!vis[i]) {
				solve(graph, st, vis, i);
			}
		}
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}
		
	}
	
	public static void solve(ArrayList<Edge> graph[], Stack<Integer> st, boolean vis[], int i) {
		
		vis[i] = true;
		
		for(Edge e: graph[i]) {
			if(!vis[e.nbr]) {
				solve(graph, st, vis, e.nbr);
			}
		}
		st.push(i);
	}
	
}
