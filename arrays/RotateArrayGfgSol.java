package arrays;

import java.util.Scanner;

public class RotateArrayGfgSol {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter The Size Of Array : ");
		int n = sc.nextInt();
		System.out.print("Enter The Rotation Index :");
		int r = sc.nextInt();
		
		int a[] = new int[n];
		int temp[] = new int[n];
		
		for(int i=0; i<n; i++){
		    a[i] = sc.nextInt(); 
		}
		for(int i=0; i<r; i++) {
			for(int j=0; j<r; j++) {
			temp[j] = a[i];
			break;}
			}
		for(int i=0; i<n-r; i++){
				a[i] = a[i+r];
				}
			int j =0;
		
	}
			
		
	}


