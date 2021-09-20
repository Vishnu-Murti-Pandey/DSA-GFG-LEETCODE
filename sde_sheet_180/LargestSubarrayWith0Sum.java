package sde_sheet_180;
import java.util.*;

public class LargestSubarrayWith0Sum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        int sum = 0;
        
        map.put(0, -1);
        
        for(int i=0; i<n; i++) {
            sum = sum + arr[i]; 
            if(map.containsKey(sum)) {
                ans = Math.max(ans, (i - map.get(sum)));
            }
            else {
                map.put(sum, i);
            }
        }
        
        System.out.println(ans);
	}

}
