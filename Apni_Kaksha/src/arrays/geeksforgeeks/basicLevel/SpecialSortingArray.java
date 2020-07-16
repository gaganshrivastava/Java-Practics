package arrays.geeksforgeeks.basicLevel;

import java.util.Arrays;
import java.util.Collections;

public class SpecialSortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//question
		//https://practice.geeksforgeeks.org/problems/sort-in-specific-order/0
		//Given an array A of positive integers. Your task is to sort them in such a way that the first part of the array contains odd numbers sorted in descending order,
		//rest portion contains even numbers sorted in ascending order
		int a[] = {1, 2, 3, 5 ,4, 7, 10};
		Arrays.sort(a);
		int n = a.length;
		int partision = n/2 +1;
		int sortedArray[] = new int[n];
		int even=partision, odd=0;
		for(int i=0; i<n; i++){
			if(a[i] % 2 == 0){
				sortedArray[even] = a[i];
				even ++;
			}else{
				sortedArray[odd] = a[i];
				odd++;
			}
		}
		
		//Arrays.sort(sortedArray, 0, partision, Collections.reverseOrder());

		//using selection sort , arranging the number in desending order
		for(int i = partision -1,  k=0 ; i>0 ; i--,k++){
			int maxIndex = i;
			for(int j = i ; j<=0;j--){
				if(sortedArray[maxIndex] < sortedArray[j]){
					maxIndex = j;
				}
			}
			
			int temp = sortedArray[k];
			sortedArray[k]= sortedArray[maxIndex];
			sortedArray[maxIndex] = temp;
		}
		
		
		
		for(int x : sortedArray){
			System.out.print(x + " ");
		}

	}

}
