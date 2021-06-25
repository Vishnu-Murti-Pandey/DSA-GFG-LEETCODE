package greedyAlgorithms;
import java.util.*;

public class NumberOfRectanglesThatCanFormTheLargestSquare {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rectangles[][] = new int[n][2];
		for(int i=0; i<n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			rectangles[i][0] = a;
			rectangles[i][1] = b;
		}
		
//		int ans = solveONSpace(rectangles);
//		System.out.println(ans);
		
		int res = solveO1Space(rectangles);
		System.out.println(res);

	}
	
	// -> o(1) space
	public static int solveO1Space(int rectangles[][]) {
		
		int maxSize = 0;
		int count = 0;
		
		for(int i=0; i<rectangles.length; i++) {
			
			int min = 0;
			
			int x = rectangles[i][0];
			int y = rectangles[i][1];
			
			min = Math.min(x, y);
			
			if(maxSize < min) {
				maxSize = min;
				count = 0;
			}
			if(maxSize == min) {
				count++;
			}
			
		}
		
		return count;
	}
	
	
	
	
	// -> o(n) space
	public static int solveONSpace(int rectangles[][]) {

		int maxSize = 0;        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<rectangles.length; i++) {
            int x = rectangles[i][0];
            int y = rectangles[i][1];
            
            int maxLen = Math.min(x, y);
            
            if(map.containsKey(maxLen)) {
                map.put(maxLen, map.get(maxLen)+1);
            }
            else {
                map.put(maxLen, 1);
            }
            
            if(maxLen > maxSize) {
                maxSize = maxLen;
            }
        }
        
        int val = map.get(maxSize);
        return val;
	}

}
