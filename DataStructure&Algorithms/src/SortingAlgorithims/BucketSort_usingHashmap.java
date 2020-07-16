package SortingAlgorithims;

import java.util.*;

public class BucketSort_usingHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a []= {54,45,12,35,69,42,74}; 
		
		bucketSort(a);
		for(int x : a){
			System.out.print(x + " ");
		}

	}

	
	public static void bucketSort(int []a){
		List<Integer> buckets[] = new List[10];
		
		for(int i = 0; i < buckets.length; i++ ){
			buckets[i] = new ArrayList<Integer>(); // every buccket is a array list
	
			//buckets[i] = new LinkedList<Integer>(); 
		}
		
		for(int i = 0; i < a.length; i++ ){
			buckets[hashValue(a[i])].add(a[i]);
		}
		
		//sorting each arrray
		for(List singBucket : buckets){
			Collections.sort(singBucket);
		}
		
		int j = 0;
		for(int i = 0 ; i < buckets.length; i++){
			for(int value:buckets[i]){
				a[j] = value;
				j++;
			}
		}
	}
	
	//on the basis of tens position
	public static int hashValue(int value){
		return (value / (int)10 ) % 10;
	}
}
