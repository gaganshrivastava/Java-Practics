package twoPointerAlgo;

import java.util.Arrays;

public class TwoSumAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int b[] = {2,5,5,11};

		// System.out.println(twoSum(a, 2));

		//System.out.println(twoSum_array(b, 6));
		int g[] = twoSum_array(b, 10);
		System.out.println();
		for(int v:g){
			System.out.print(v + " ");
		}
	}

	// check wheather the sum of two number in a given array is equal to the
	// given number
	static boolean twoSum(int a[], int sumN) {
		int sum = 0;
		Arrays.sort(a);
		int SumNumber = sumN;
		boolean flag = false;

		// this is solved by O(N) complexity

		// i is from the starting index, j is for the ending index
		for (int i = 0, j = a.length - 1; i < j;) {
			sum = a[i] + a[j];
			if (sum < SumNumber) {
				i++;
			} else if (sum > SumNumber) {
				j--;
			} else {
				/*
				 * flag = true; break;
				 */
				return true;
			}
		}

		// System.out.println(flag);
		return flag;
	}

	// check wheather the sum of two number in a given array is equal to the
	// given number
	static int[] twoSum_array(int b[], int sumN) {
		int ans[] = new int[2];
		int copy[] = new int[b.length];
		for(int i=0;i<b.length ; i++){
			copy[i] = b[i];
		}
		

		Arrays.sort(copy);
	
		for (int i = 0, j = copy.length - 1; i < j;) {
			int sum = copy[i] + copy[j];
			if (sum < sumN) {
				i++;
			} else if (sum > sumN) {
				j--;
			} else {
				for (int x = 0; x < b.length; x++) {
					if (copy[i] == b[x]) {
						ans[0] = x;
					} else if (copy[j] == b[x]) {
						ans[1] = x;
					}
				}
				break;
			}
		}

		for (int l : ans) {
			System.out.print(l);
		}

		return ans;
		// System.out.println(flag);

	}
}
