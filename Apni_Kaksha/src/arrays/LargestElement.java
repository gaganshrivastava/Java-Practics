package arrays;

public class LargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] ={88,44,12,14,18,36,47};
		
		int largest = a[0];
		int index = 0;
		
		for(int i= 0;i<a.length;i++){
			if(a[i] > largest){
				largest = a[i];
				index = i;
			}
		}
		
		System.out.println("Largest element is at "+ index + " position that number is " + largest );

	}

}
