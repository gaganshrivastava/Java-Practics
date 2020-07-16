package twoPointerAlgo;


import java.util.Arrays;

public class FindTripletSumZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		int a[] = { 0, -1, 2, -3, 1 };
		
		//we can sort 
		 Arrays.sort(a);
		 
		 
		//System.out.println(findTripletSum(a,n));
		
	//	System.out.println(TwoSumAlgo.twoSum(a, 2));
		
		System.out.println(findTripletSum_methodtwo(a,n));

	}
	
	static boolean findTripletSum (int a[] , int n){
		//O of N^3 method , worst method
		int sum = 0;
		boolean flag = false;
		for (int i = 0; i < a.length - 2; i++) {
			for (int j = i+1; j < a.length - 1; j++) {
				for (int k = j+1; k < a.length; k++) {
					sum = a[i] + a[j] + a[k];
					if (sum == 0) {
						flag = true;
						break;
					}
				}
				if (flag) {
					break;
				}
			}

			if (flag) {
				break;
			}
		}
		//System.out.println(flag);
		return flag;
	}
	
	static boolean findTripletSum_methodtwo (int a[] , int n){
		
		//this will checkk thta wheater the sum of two number is the opssite of a[i] th number or not.
		// if the two sum return true then triplet sum is zero
		for(int i=0; i<n-2 ; i++){
			if(twoSum(a, -a[i], i+1)) {
				return true;
			}	
		}
		
		return false;
	}
	
	static boolean twoSum(int a[], int sumN, int startingIndex) {
		int sum = 0;

		int SumNumber = sumN;
		boolean flag = false;

		// this is solved by O(N) complexity
		
		//i is from the starting index, j is for the ending index
		for (int i = startingIndex, j = a.length - 1; i < j;) {
			sum = a[i] + a[j];
			if (sum < SumNumber) {
				i++;
			} else if (sum > SumNumber) {
				j--;
			} else {
				/*flag = true;
				break;*/
				return true;
			}
		}

		//System.out.println(flag);
		return flag;
	}



}
