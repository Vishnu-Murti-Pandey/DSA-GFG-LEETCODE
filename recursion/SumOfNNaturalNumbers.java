package recursion;

import java.util.Scanner;

public class SumOfNNaturalNumbers {

	public static void main(String[] args) {
		
		System.out.println(Sum(37));
		
	}
	
	static int Sum(int n) {
		if(n==1) {
			return 1;
		}
		return  n + Sum(n-1);
	}
}
