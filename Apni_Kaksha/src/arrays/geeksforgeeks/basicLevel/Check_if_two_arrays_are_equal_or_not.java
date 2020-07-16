package arrays.geeksforgeeks.basicLevel;

public class Check_if_two_arrays_are_equal_or_not {
//question 
	//Given two arrays A and B of equal size N, the task is to find if given arrays are equal or not. Two arrays are said to be equal if both of them contain same set of elements, arrangements (or permutation) of elements may be different though.
	//Note : If there are repetitions, then counts of repeated elements must also be same for two array to be equal.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1, 2, 5, 4, 0,6};
		int b[] = {2,6, 4, 5, 0, 1};
		int c[] = new int[a.length];
		boolean flag = false;
		
		for(int i = 0; i <a.length;i++){
			flag = false;
			for(int j = 0;j<b.length ;j++){
				if(a[i] == b[j] && c[j] != -1){
					c[j] = -1;
					flag = true;
					break;
				}
					
			}
		}

		if(flag){
			System.out.println("Both the array is same");
		}else
			System.out.println("Both the array is not same");
	}

}
