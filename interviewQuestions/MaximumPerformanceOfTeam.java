package interviewQuestions;
import java.util.*;

public class MaximumPerformanceOfTeam {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int s[] = new int[n];
		int e[] = new int[n];
		
		for(int i=0; i<n; i++) {
			s[i] = sc.nextInt();
		}
		for(int i=0; i<n; i++) {
			e[i] = sc.nextInt();
		}
		
		int k = sc.nextInt();
		
		int ans = maxPerformance(n, s, e, k);
		System.out.println(ans);

	}
	
	public static int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        
        pair arr[] = new pair[n];
        
        for(int i=0; i<n; i++) {
            arr[i] = new pair(speed[i], efficiency[i]);
        }        
        
        Arrays.sort(arr, new Comparator<pair>() {
            public int compare(pair a, pair b) {
                return b.e - a.e;
            }
        });
        
        PriorityQueue<pair> pq = new PriorityQueue<>(k, (a, b) -> a.s - b.s);
        
        long ts = 0;
        long ans = 0;
        
        for(pair p: arr) {
            
            if(pq.size() >= k) {
                ts = ts - pq.poll().s;
            }
            
            pq.add(p);
            
            ts = ts + p.s;
            long fts = ts*(long)p.e;
            
            ans = Math.max(ans, fts);
            
        }
        
        return (int)(ans%1000000007);
    }
    
    static class pair{
        int s;
        int e;
        pair(int s, int e) {
            this.s = s;
            this.e = e;
        }
    
    }

}
