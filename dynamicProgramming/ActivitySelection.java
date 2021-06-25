package dynamicProgramming;
import java.util.*;

public class ActivitySelection {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int s[] = new int[n];
		int f[] = new int[n];
		
		for(int i=0; i<n; i++) {
			s[i] = sc.nextInt();
			f[i] = sc.nextInt();
		}
		
		Pair arr[] = new Pair[n];
		for(int i=0; i<n; i++) {
			arr[i] = new Pair(s[i], f[i]);
		}
		
		
		Arrays.sort(arr, new Comparator<Pair>() {
            public int compare(Pair a, Pair b) {
                return a.y - b.y;      
           }
        
        });     
        
        int last = 0;
        int ans = 0;
        
        for(int i=0; i<n;  i++) {
            if(arr[i].x > last) {
                ans++;
                last = arr[i].y;
            }
        }
        
        System.out.println(ans);

	}
	
	static class Pair {
		int x;
		int y;
		
		public Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

}

