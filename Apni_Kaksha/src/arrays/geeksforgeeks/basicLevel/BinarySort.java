package arrays.geeksforgeeks.basicLevel;

public class BinarySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,0,1,1,0};
		int n = a.length;
		int sortedArray[] = new int[n];
		int countZero = 0;
		
		//counting the total number oof zeros
		for(int i = 0; i <n ; i++){
			if(a[i] == 0){
				countZero++;
			}
		}
		
		//appending ones after the  count of zeros
		for(int i = countZero;i< n ; i++ ){
			sortedArray[i] = 1;
		}
		
		//printing sorted array
		for(int x : sortedArray){
			System.out.print(x + " ");
		}

	}
	
	
	public static void sortNumber(int a[]){
		for(int i = 0, j = a.length-1; i<j ;){
			if(a[i] < a[j]){
				i++;
			}else if(a[i] > a[j]){
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				j--;
			}else{
				
			}
		}
	}

}
