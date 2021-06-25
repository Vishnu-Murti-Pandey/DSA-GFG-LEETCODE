package graphs;

import java.util.*;

public class Graph {

	private LinkedList<Integer> adj[];
	
	public Graph(int v) {
		adj = new LinkedList[v];
		for(int i=0; i<v; i++) {
			adj[i] = new LinkedList<Integer>();
		}
	}
	
	public void addEdge(int source, int destination) {
		adj[source].add(destination);
		adj[destination].add(source);
	}
	
	public void printGraph(int v) {
		for(int i=0; i<v; i++) {
			System.out.print(i+"-> ");
			for(int x: adj[i]) {
				System.out.print(x+", ");
			}
			System.out.println();
		}
	}
	
	private boolean dfsUtil(int source, int destination, boolean vis[]) {
		if(source == destination) {
			return true;
		}
		for(int neighbor: adj[source]) {
			if(!vis[neighbor]) {
				vis[neighbor] = true;
				boolean isConnected = dfsUtil(neighbor, destination, vis);
				if(isConnected) return true;
			}
		}
		return false;
	}
	
	public boolean dfs(int source, int destination) {
		boolean vis[] = new boolean[adj.length];
		return dfsUtil(source, destination, vis);
	}
	
	public boolean dfsStack(int source, int destination) {
		
		boolean vis[] = new boolean[adj.length];
		Stack<Integer> s = new Stack<>();
		s.push(source);
		
		while(!s.isEmpty()) {
			int cur = s.pop();
			if(cur == destination) return true;
			
			for(int neighbor: adj[cur]) {
				if(!vis[neighbor]) {
					vis[neighbor] = true;
					s.push(neighbor);	
				}
			}
		}
		
		return false;
	}
	
	public int bfs(int source, int destination) {
		
		boolean vis[] = new boolean[adj.length];
		int parent[] = new int[adj.length];
		Queue<Integer> q = new LinkedList<>();
		
		q.add(source);
		parent[source] = -1;
		vis[source] = true;
		
		while(!q.isEmpty()) {
			int cur = q.poll();
			if(cur == destination) break;
			
			for(int neighbor: adj[cur]) {
				if(!vis[neighbor]) {
					
					vis[neighbor] = true;
					q.add(neighbor);
					parent[neighbor] = cur;
				}
			}
		}
		                                               
		int cur = destination;
		int distance = 0;
		while(parent[cur] != -1) {
			System.out.print(cur+" <- ");
			cur = parent[cur];
			distance++;
		}
		
		return distance;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of vertices and edges");
		
		int v = sc.nextInt();
		int e = sc.nextInt();
		
		Graph graph = new Graph(v);
		System.out.println("Enter "+e+" edges");
		for(int i=0; i<e; i++) {
			int source = sc.nextInt();
			int destination = sc.nextInt();
			
			graph.addEdge(source, destination);
			
		}
		
		graph.printGraph(v);
		
		System.out.println("Enter source and destination");
		
		int source = sc.nextInt();
		int destination = sc.nextInt();
		
		int distance = graph.bfs(source, destination);
		System.out.println("min distance is " + distance);
		
		
//		System.out.println("possible "+ graph.dfs(source, destination));
//		System.out.println("possible "+ graph.dfsStack(source, destination));
		
		sc.close();
	}
}
