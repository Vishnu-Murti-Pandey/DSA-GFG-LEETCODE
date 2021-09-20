package sde_sheet_180;
import java.util.*;

public class FourSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nums[] = new int[n];
		for(int i=0; i<n; i++) {
			nums[i] = sc.nextInt();
		}
		int tar = sc.nextInt();
		
		Arrays.sort(nums);
		
		List<List<Integer>> list = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				
				int left = j+1;
				int right = n-1;
				int sumOfij = nums[i]+nums[j];
				int tarToGet = tar - sumOfij;
				
				while(left < right) {
					if(nums[left]+nums[right] < tarToGet) {
						left++;
					}
					else if(nums[left]+nums[right] > tarToGet) {
						right--;
					}
					else {
						ArrayList<Integer> ll = new ArrayList<>();
						ll.add(nums[i]);
						ll.add(nums[j]);
						ll.add(nums[left]);
						ll.add(nums[right]);
						
						list.add(ll);
						
						while(left<right && nums[left]==ll.get(2)) {
							left++;
						}
						while(left<right && nums[right] == ll.get(3)) {
							right--;
						}
					}
				}
				while(j+1<n && nums[j+1] == nums[j]) {
					j++;
				}
				
			}
			while(i+1<n && nums[i+1]==nums[i]) {
				i++;
			}
		}
		
		for(int i=0; i<list.size(); i++) {
			List<Integer> ans = list.get(i);
			System.out.println(ans);
		}
		
	}

}
