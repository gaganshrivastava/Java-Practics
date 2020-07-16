package arrays;

import java.util.Scanner;

public class AverageMarksOfStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number of students");
		
		int n = sc.nextInt();
		int[] marks = new int[n];
		
		for(int i=0 ; i<marks.length;i++){
			System.out.println("Enter the marks of " + i +"th students");
			marks[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i = 0;i<n ; i++){
			sum = sum + marks[i];
		}
		
		int averagMarks = sum/n;
		
		System.out.println("Avrage of all the students is = " + averagMarks);
		sc.close();
	}

}
