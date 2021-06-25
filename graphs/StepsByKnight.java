package graphs;
import java.util.*;

public class StepsByKnight {
	
	static int dx[]={2,2,-2,-2,1,1,-1,-1};
    static int dy[]={1,-1,1,-1,2,-2,2,-2}; 

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-->0) {
			int n = sc.nextInt();
			
			int s1 = sc.nextInt();
			int s2 = sc.nextInt();
			
			int d1 = sc.nextInt();
			int d2 = sc.nextInt();
			
			boolean vis[][] =  new boolean[n][n];
			
			System.out.println(steps(vis, s1-1, s2-1, d1-1, d2-1, n));
			
		}
	}
	
	public static int steps(boolean vis[][], int s1, int s2, int d1, int d2, int n) {
		
		Queue<cell> q = new LinkedList<>();
		q.add(new cell(s1, s2, 0));
		vis[s1][s2] = true;
		
		while(!q.isEmpty()) {
			cell e = q.poll();
			if(e.x == d1 && e.y == d2) {
				return e.dc;
			}
			int curdis = e.dc;
			for(int i=0; i<=7; i++) {
				int a = e.x + dx[i];
				int b = e.y + dy[i];
				
				if(isVisited(a, b, n) && !vis[a][b]) {
					q.add(new cell(a, b, curdis+1));
					vis[a][b] = true;
				}
			}
		}
		return -1;
	}
	
	public static boolean isVisited(int a, int b, int n) {
		if(a<0 || b<0 || a>=n || b>=n) {
			return false;
		}
		return true;
	}
}

class cell {
	int x;
	int y;
	int dc;
	
	cell(int x, int y, int dc) {
		this.x = x;
		this.y = y;
		this.dc = dc;
	}
}