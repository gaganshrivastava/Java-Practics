package arrays;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows = sc.nextInt();
		System.out.println("Enter the number of coloumns");
		int col = sc.nextInt();
		
		int a[][] = new int[rows][col];
		int b[][] = new int[rows][col];
		
		/*System.out.println(a.length);
		System.out.println(b[0].length);*/
		
		for(int i=0; i<a.length;i++){ //for rows 
			for(int j=0;j<a[0].length ; j++){ //for coloumns
				System.out.println(" Enter the element of first marix " + i + "th rows " + "and " + j+ "th col");
				a[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<b.length;i++){
			for(int j=0;j<b[0].length ; j++){
				System.out.println("Enter the element of second matrix" + i + "th rows " + "and " + j+ "th col");
				b[i][j] = sc.nextInt();
			}
		}
		

		int sum[][] = new int[rows][col];
		
		for(int i=0; i<rows;i++){
			for(int j=0;j<col ; j++){
				
				sum [i][j] = a[i][j] +b[i][j];
			}
		}
		
		for(int i=0; i<sum.length;i++){
			for(int j=0;j<sum[0].length ; j++){
				
				
				System.out.print("Sum of " + i + " st rows" + j+ " th col is = " + sum[i][j] );
			}
			System.out.println();
		}
		
	}

}
