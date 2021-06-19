package arrays;

import java.util.Scanner;

public class AverageMarksOfStudents {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter total number of students : ");
		int n = sc.nextInt();
		
		System.out.println("enter the marks of "+n +" students : ");
		int marks [];
		marks = new int [n];
		
		for(int i=0; i<n; i++)
		{
			marks[i] = sc.nextInt();
		}
		
		double average = 0;
		
		for(int i=0; i<n; i++) {
			average +=  marks[i];
		}
		 average = (double) average / n;
		
		System.out.println("the average is "+average);

	}

}
