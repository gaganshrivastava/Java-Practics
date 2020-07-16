package arrays.geeksforgeeks.basicLevel;

public class PlayWithArray {
	
	//question
	//Given an unsorted array arr of size N, rearrange the elements of array such that number at the odd index is greater than the number at the previous even index
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {5,4,3,2,1};
		/*int a[] = {
				87,78,16,94,36,87,93,50,22,63,28,91,60,64,27,41,27,73,37,12,69,68,30,83,31,63,24,68,36,30,3,23,59,70,68,94,57,12,43,30,74,22,20,85,38,99,25,16,71,14,27,92,81,57,74,63,71,97,82,6,26,85,28,37,6,47,30,14,58,25,96,83,46,15,68,35,65,44,51,88,9,77,79,89
		};*/
		
		for(int i =0,j=1; i < a.length && j<a.length; i+=2,j+=2 ){
			if(a[j]< a[i]){
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		for(int x : a){
			System.out.print( x +" ");
		}
		
		boolean flag = false;
		for(int i =0,j=1; i < a.length && j<a.length; i+=2,j+=2 ){
			 flag = false;
			if(a[j]> a[i]){
				flag = true;
			}
		}
		System.out.println();
		if(flag){
			System.out.println("Question DOne array sorted");
		}else{
			System.out.println("Question not Done array not  sorted");
		}
		
		//return a;
	}

}
