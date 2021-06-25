package greedyAlgorithms;

import java.util.Scanner;

public class PartitioningIntoMinimumNumberOfDeciBinaryNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		int res = 0;
		
		for(int i=0; i<str.length(); i++) {
			res = Math.max(res, str.charAt(i)-'0');
		}
		
		System.out.println(res);
	}

}
