package sde_sheet_180;
import java.util.*;

public class TwoSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nums[] = new int[n];
		for(int i=0; i<n; i++) {
			nums[i] = sc.nextInt();
		}
		int tar = sc.nextInt();
		
		HashMap<Integer, Integer> map = new HashMap<>();
        int ans[] = new int[2];
        
        for(int i=0; i<nums.length; i++) {
            if(!map.containsKey(tar-nums[i])) {
                map.put(nums[i], i);
            }
            else {
                ans[0] = map.get(tar-nums[i]);
                ans[1] = i;
                break;
            }
        }
        
        System.out.println(ans[0]+" "+ans[1]);
	}

}
