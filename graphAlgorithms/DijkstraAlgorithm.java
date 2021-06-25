package graphAlgorithms;

import java.io.*;
import java.util.*;

public class DijkstraAlgorithm {
	
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
		String psf;
		int wsf;
		
		Pair(int v, String psf, int wsf) {
			this.v = v;
			this.psf = psf;
			this.wsf = wsf;
		}
		
		@Override
		public int compareTo(Pair o) {
			return this.wsf - o.wsf;
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
			int v1 = Integer.parseInt(str[0]);
			int v2 = Integer.parseInt(str[1]);
			int wt = Integer.parseInt(str[2]);
			
			graph[v1].add(new Edge(v1, v2, wt));
			graph[v2].add(new Edge(v2, v1, wt));	
		}
		int src = Integer.parseInt(br.readLine());
		
		
		PriorityQueue<Pair> pq = new PriorityQueue<>();
		pq.add(new Pair(src, src+"", 0));
		boolean vis[] = new boolean[vtces];
		
		while(!pq.isEmpty()) {
			Pair p = pq.poll();
			
			if(vis[p.v]) {
				continue;
			}
			else {
				vis[p.v] = true;
			}
			System.out.println(p.v +" via "+ p.psf +" @ "+ p.wsf);
			
			for(Edge e: graph[p.v]) {
				if(!vis[e.nbr]) {
					pq.add(new Pair(e.nbr, p.psf+e.nbr, p.wsf+e.wt));
				}
			}
		}
		
	}

}
