package graphs;
import java.util.*;

public class HamiltonianPath {
	
	public static void main (String[] args) {
		 
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-->0) {
        	int v = sc.nextInt();
        	int e = sc.nextInt();
        	
        	Graph2 g = new Graph2(v);
        	
        	for(int i=0; i<e; i++) {
        	    int src = sc.nextInt();
        	    int dest = sc.nextInt();
        	    
        	    g.addEdge(src-1, dest-1);
        	}
        	
        	g.hpath();
            
        }
	}
}

class Graph2 {
    ArrayList<ArrayList<Integer>> list;
    int v;
    
    Graph2(int nodes) {
        v = nodes;
        list = new ArrayList<ArrayList<Integer>>();
        
        for(int i=0; i<v; i++) {
            list.add(new ArrayList<Integer>());
        }
    }
    
    public void addEdge(int src, int dest) {
        list.get(src).add(dest);
        list.get(dest).add(src);
    }
    
    static boolean flag = false;
    
    public void hpath() {
    	
    	flag = false;
    	
		HashSet<Integer> set = new HashSet<>();
		
		hPathUtil(0, set);
    
    	if(flag) {
    		System.out.println(1);
    	}
    	else {
    		System.out.println(0);
    	}
    	
    }
    
    public void hPathUtil(int i, HashSet<Integer> set) {
    	
    	if(set.size() == list.size()-1) {
    		flag = true;
    		return;
    	}
    	set.add(i);
    	
    	for(int j: list.get(i)) {
    		if(!set.contains(i)) {
    			hPathUtil(j, set);
    		}
    	}
    	set.remove(i);
    	
    }
  
}
