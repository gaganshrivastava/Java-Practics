package arrays.geeksforgeeks.basicLevel;

import java.util.Arrays;

//question
//Given an unsorted array of size N of positive integers. One number 'A' from set {1, 2, …N} is missing and one number 'B' occurs twice in array. Find these two numbers.
public class FindMissingAndRepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3,4,5,5};
		
		Arrays.sort(a);
		int missingNumber = 0 ;
		int duplicate=0;
		int k = 1;
		for(int i = 0,j=1; i< a.length & j<a.length;i++,j++){
			if(a[i] != k && missingNumber <k){
				missingNumber = k;
			}
			
			if((a[i] == a[j])){
				duplicate = a[i];
			}
			k++;
		}
		
		for(int x : a){
			System.out.print(x+" ");
		}
System.out.println();
		System.out.println("Missing " + missingNumber);
		System.out.println("duplicate " + duplicate);
	}

}
