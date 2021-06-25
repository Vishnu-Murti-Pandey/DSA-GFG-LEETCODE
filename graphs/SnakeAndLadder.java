package graphs;
import java.util.*;

public class SnakeAndLadder {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-->0) {
			int n = sc.nextInt();
			
			int snakeOrLadder[] = new int[30];
			Arrays.fill(snakeOrLadder, -1);
			
			while(n-->0) {
				int src = sc.nextInt();
				int dest = sc.nextInt();
				
				snakeOrLadder[src-1] = dest-1;
			}	
			
			Queue<entry> q = new LinkedList<>();
			boolean vis[] = new boolean[30];
			
			entry qe = new entry();
			qe.cellNo = 0;
			qe.dc = 0;
			vis[0] = true;
			q.add(qe);
			
			while(!q.isEmpty()) {
				qe = q.poll();
				int v = qe.cellNo;
				
				if(v == 29) {
					break;
				}
				
				for(int i=v+1; i<=(v+6) && i<30; i++) {
					if(!vis[i]) {
						entry a = new entry();
						vis[i] = true;
						a.dc = (qe.dc+1);
						
						if(snakeOrLadder[i] != -1) {
							a.cellNo = snakeOrLadder[i];
						}
						else {
							a.cellNo = i;
						}
						q.add(a);
					}
				}
			}
			System.out.println(qe.dc);
		}
	}
}

class entry {
	
	int cellNo;
	int dc;
	
}
