package dynamicProgramming;
import java.util.*;

public class BoxStacking {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0) {
	        int n = sc.nextInt();
	        
	        int A[]  =new int[n];
	        int B[] = new int[n];
	        int C[] = new int[n];
	        
	        for(int i=0; i<n; i++) {
	        	A[i] = sc.nextInt();
	        }
	        for(int i=0; i<n; i++) {
	        	B[i] = sc.nextInt();
	        }
	        for(int i=0; i<n; i++) {
	        	C[i] = sc.nextInt();
	        }
	        
	        int ans = maxHeight(A, B, C, n);
	        System.out.println(ans);
	        
	    }
		
	}
	
	public static int maxHeight(int[] height, int[] width, int[] length, int n) {
        
		Box box[] = new Box[3*n];
        
        int idx = 0;
        
        for(int i=0; i<n; i++) {
            box[idx++] = new Box(Math.max(width[i], length[i]), Math.min(length[i], width[i]), height[i]);
            box[idx++] = new Box(Math.max(height[i], length[i]), Math.min(height[i], length[i]), width[i]);
            box[idx++] = new Box(Math.max(height[i], width[i]), Math.min(height[i], width[i]), length[i]);
        }
        
        Arrays.sort(box, new Comparator<Box>() {
            
            public int compare(Box a, Box b) {
                return a.area - b.area;
            }
            
        });
        
        int dph[] = new int[3*n];
        for(int i=0; i<3*n; i++) {
            dph[i] = box[i].h;
        }
        
        int maxHeight = 0;
        
        for(int i=1; i<3*n; i++) {
            int max = 0;
            for(int j=0; j<i; j++) {
                
                if((box[i].l > box[j].l) && (box[i].w > box[j].w)) {
                    max = Math.max(max, dph[j]);
                }
                
            }
            dph[i] = max + box[i].h;
            maxHeight = Math.max(maxHeight, dph[i]);
            
        }
        return maxHeight;
    }
        
}

class Box {
    int l;
    int w;
    int h;
    int area;
    
    Box(int l, int w, int h) {
        this.l = l;
        this.w = w;
        this.h = h;
        area = l*w;
    }
    
}

