package graphs;
import java.util.*;

public class DFS{
	
	public static void main(String[] args) {
		
		Graph1 g = new Graph1(5);
		
		g.addEdge(0, 1);
		g.addEdge(3, 2);
		g.addEdge(2, 4);
		g.addEdge(1, 4);
		g.addEdge(3, 1);
		g.addEdge(2, 0);
		
		g.printGraph();
		
		g.dfs(0);

	}
}

class Graph1 {
	
	ArrayList<ArrayList<Integer>> list;
	int v;
	
	Graph1(int nodes) {
		v = nodes;
		list = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<v; i++) {
			list.add(new ArrayList<Integer>());
		}
	}	
	
	void addEdge(int src, int dest) {
		
		list.get(src).add(dest);
		list.get(dest).add(src);
		
	}
	
	void printGraph() {
		for(int i=0; i<v; i++) {
			System.out.print("Node " +i);
			for(int x: list.get(i)) {
				System.out.print(" -> "+x+" ");
			}
			System.out.println();
		}
	}
	
	void dfs(int src) {
		boolean vis[] = new boolean[v];
		dfsUtil(src, vis);
	}
	
	void dfsUtil(int src, boolean vis[]) {
		vis[src] = true;
		System.out.print(src+" ");
		
		for(int x: list.get(src)) {
			if(!vis[x]) {
				dfsUtil(x, vis);
			}	
		}
	}
	
}
