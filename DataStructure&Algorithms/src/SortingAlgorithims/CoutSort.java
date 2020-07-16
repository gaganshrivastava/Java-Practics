package SortingAlgorithims;

public class CoutSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {30,92,94,25,86,29,25};
		
		countsortting(a, 10, 100);
		
		for(int x: a){
			System.out.print(x +" ");
		}

	}
	
	
	public static void countsortting(int a[], int min, int max){
		
		int countArray[] = new int [max-min +1];
		for(int i = 0; i < a.length; i++){
			countArray[a[i]- min]++; // this will make the count of the number in a at the i-1 position  
		}
		int j = 0;
		for(int i= min ; i <= max; i++){// this wil travserse through the numbers
			while(countArray[i-min] > 0){
				a[j] = i; // assgin the numbe to the proper index
				j++;
				countArray[i-min]--; // decrement the count
			}
		}
	}

}
