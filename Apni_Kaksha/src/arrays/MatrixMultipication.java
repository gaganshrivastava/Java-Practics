package arrays;

import java.util.Scanner;

public class MatrixMultipication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows of first matrix");
		int rows = sc.nextInt();
		System.out.println("Enter the number of coloumns of first matrix");
		int col = sc.nextInt();
		
		int m1[][] = new int[rows][col];
		
		System.out.println("Enter the number of rows of first matrix");
		int rows2 = sc.nextInt();
		System.out.println("Enter the number of coloumns of first matrix");
		int col2 = sc.nextInt();
		int m2[][] = new int[rows2][col2];
		
		if(col == rows2){
			/*for(int innerA1[]: m1 ){
				for(int x: innerA1){
					System.out.println("Enter the fist martix");
					x = sc.nextInt();
				}
			}*/
			
			for(int i=0;i<m1.length;i++){
				for(int j=0; j<m1[0].length;j++){
					System.out.println(" Enter the element of first marix " + i + "th rows " + "and " + j+ "th col");
					m1[i][j] = sc.nextInt();
				}
			}
			
			System.out.println("Now enter second MAtrix");
			for(int i=0;i<m2.length;i++){
				for(int j=0; j<m2[0].length;j++){
					System.out.println(" Enter the element of second marix " + i + "th rows " + "and " + j+ "th col");
					m2[i][j] = sc.nextInt();
				}
			}
			
			int m3[][] = new int[rows][col2];
			
			for(int i=0 ; i< rows; i++){
				for(int j = 0;j<col2 ; j++){
					m3[i][j]=0;
					for(int k=0;k< rows2 ; k++){
						m3[i][j] =  m3[i][j]  + (m1[i][k]*m2[k][j]); 
					}
					
				}
			}
			
			System.out.println("Third matrix is: ");
			for(int i=0; i<m3.length;i++){
				for(int j=0;j<m3[0].length ; j++){
					
					
					System.out.print( m3[i][j]  + " ");
				}
				System.out.println();
			}
			
		}else{
			System.out.println("Matrix can't be multiples with given dimensions");
		}

	}

}
