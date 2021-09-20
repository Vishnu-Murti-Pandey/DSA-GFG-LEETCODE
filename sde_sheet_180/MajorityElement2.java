package sde_sheet_180;
import java.util.*;

public class MajorityElement2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nums[] = new int[n];
		for(int i=0; i<n; i++) {
			nums[i] = sc.nextInt();
		}
		
		int c1 = 0;
        int c2 = 0;
        int ele1 = 0;
        int ele2 = 0;
        
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == ele1) {
                c1++;
            } 
            else if(nums[i] == ele2) {
                c2++;
            }
            else {
                if(c1 == 0) {
                    ele1 = nums[i];
                    c1++;
                } 
                else if(c2 == 0) {
                    ele2 = nums[i];
                    c2++;
                }
                else {
                    c1--;
                    c2--;
                }
            }
        }
        
        int freq1 = 0;
        int freq2 = 0;
        
        for(int i=0; i<nums.length; i++) {
            if(ele1 == nums[i]) {
                freq1++;
            }
            else if(ele2 == nums[i]) {
                freq2++;
            }
        }
        
        if(freq1 <= nums.length/3) {
            freq1 = -1;
        } 
        if(freq2 <= nums.length/3) {
            freq2 = -1;
        }
        
        List<Integer> ans = new ArrayList<>();
        
        if(freq1 != -1) {
            ans.add(ele1);
        }
        if(freq2 != -1) {
            ans.add(ele2);
        }
        
        System.out.println(ans);
	}

}
