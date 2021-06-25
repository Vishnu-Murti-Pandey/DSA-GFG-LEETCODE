package graphs;

import java.util.*;

public class GraphByMap {

	private HashMap<Integer, LinkedList<Integer>> map;
	
	public GraphByMap() {
		map = new HashMap<>();
	}
	
	public void addEdge(int source, int destination) {
		if(!map.containsKey(source)) {
			LinkedList<Integer> l1 = new LinkedList<>();
			l1.add(destination);
			map.put(source, l1);
			
			LinkedList<Integer> l2 = new LinkedList<>(); 
			l2.add(source);
			map.put(destination, l2);
		}
		else {
			LinkedList<Integer> l = map.get(source);
			l.add(destination);
			map.put(source, l);
			
			LinkedList<Integer> l2 = new LinkedList<>(); 
			l2.add(source);
			map.put(destination, l2);
		}
	}
	
	
	public void print(int v) {
		for(Map.Entry<Integer, LinkedList<Integer>> en: map.entrySet()) {
			System.out.println(en.getKey() +"  -->  "+ en.getValue());
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter numbers of vertices & edges");
		
		int v = sc.nextInt();
		int e = sc.nextInt();
		System.out.println("Enter "+e+" edges");
		
		GraphByMap g = new GraphByMap();
		
		for(int i=0; i<e; i++) {
			int source = sc.nextInt();
			int destination = sc.nextInt();
			
			g.addEdge(source, destination);
		}

		g.print(v);
		
		sc.close();
		
	}

}
