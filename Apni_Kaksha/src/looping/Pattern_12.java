package looping;

import java.util.Scanner;

public class Pattern_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		
		12344321
		123**321
		12****21
		1******1

*/		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows ");
		int n= sc.nextInt();
		
		for(int i=n;i>=1;i--){
			//for first square
			for(int j = 1; j<=n;j++){
				if(j>i)
					System.out.print("*");
				else
					System.out.print(j);
			}
			
			//for second square
			for(int j=n; j>=1 ;j--){
				if(j>i){
					System.out.print("*");
				}else
					System.out.print(j);
			}
			System.out.println();
		}
		
			
		
		
			
			
		
	}

}
