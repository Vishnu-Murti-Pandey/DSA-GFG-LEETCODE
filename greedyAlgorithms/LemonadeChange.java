package greedyAlgorithms;
import java.util.*;

public class LemonadeChange {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nums[] = new int[n];
		for(int i=0; i<n; i++) {
			nums[i] = sc.nextInt();
		}
		
		boolean ans = lemonadeChange(nums);
		System.out.println(ans);
		
	}
	
	public static boolean lemonadeChange(int[] bills) {
        
        int five = 0;
        int ten = 0;
        
        for(int i=0; i<bills.length; i++) {
            if(bills[i] == 5) {
                five++;
            }
            else if(bills[i] == 10) {
                ten++;
                if(five > 0) {
                   five--; 
                }
                else {
                    return false;
                }
            }
            else if(bills[i] == 20){
                if(five>0 && ten>0) {
                    five--;
                    ten--;
                }
                else if(five>=3) {
                    five = five - 3;
                }
                else {
                    return false;
                }
            }
            else {
                return false;
            }
        }
        
        return true;
    }
	

}
