package sorting;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scanner sc = new Scanner(System.in); 
		
		int a[]= {4,5,3,6,9,8};
		int n = a.length;
		
		//outer loop will run over n-1 times 
		//inner loop will run over n-1-i times (one les then outer loop), 
		//because after every iteration the biggest element is set at the end of arry
		
		//sorted flag is used because  it is not necesaary that each aray is going for n-1 iteration
		//some arrays are sorted earlier also
		
		for(int i = 0;i < n-1 ;i++){
			boolean sorted = true;
			 for(int j =0;j<n-1-i ;j++){
				 if(a[j+1]<a[j]){
					 int temp = a[j+1];
					 a[j+1]= a[j];
					 a[j] = temp;
					 
					 sorted = false;
				 }
			 }
			
			 if(sorted)
				 break;
			 
		}
		//for printing
		for(int item : a){
			System.out.print(item + "  ");
		}
	}

}
