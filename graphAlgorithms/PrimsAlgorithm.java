package graphAlgorithms;
import java.io.*;
import java.util.*;

public class PrimsAlgorithm {
	static class Edge {
		int src;
		int nbr;
		int wt;
		
		Edge(int src, int nbr, int wt) {
			this.src = src;
			this.nbr = nbr;
			this.wt = wt;
		}
	}
	
	static class Pair implements Comparable<Pair> {
		int v;
		int p;
		int wt;
		
		Pair(int v, int p, int wt) {
			this.v = v;
			this.p = p;
			this.wt = wt;
		}
		
		@Override
		public int compareTo(Pair o) {
			return this.wt - o.wt;
		}
		
	}

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int vtces = Integer.parseInt(br.readLine());
		ArrayList<Edge> graph[] = new ArrayList[vtces];
		for(int i=0; i<vtces; i++) {
			graph[i] = new ArrayList<>();
		}
		
		int edges = Integer.parseInt(br.readLine());
		for(int i=0; i<edges; i++) {
			String str[] = br.readLine().split(" ");
			int v1 = Integer.parseInt(str[0]) - 1;
			int v2 = Integer.parseInt(str[1]) - 1;
			int wt = Integer.parseInt(str[2]);
			
			graph[v1].add(new Edge(v1, v2, wt));
			graph[v2].add(new Edge(v2, v1, wt));	
		}
		
		PriorityQueue<Pair> pq = new PriorityQueue<>();
		pq.add(new Pair(0, -1, 0));
		boolean vis[] = new boolean[vtces];
		
		int totalWeight = 0;
		
		while(!pq.isEmpty()) {
			Pair rem = pq.poll();
			
			if(vis[rem.v]) {
				continue;
			}
			else {
				vis[rem.v] = true;
			}
			totalWeight = totalWeight + rem.wt;
			
			for(Edge e: graph[rem.v]) {
				if(!vis[e.nbr]) {
					pq.add(new Pair(e.nbr, rem.v, e.wt));
				}
			}
		}
		System.out.println(totalWeight);
	}
}