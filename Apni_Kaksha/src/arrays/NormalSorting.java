package arrays;

public class NormalSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] ={25,12,44,36,12,1,26};
		
		//it goes from left to right in the sorting order
		for(int i=0;i<a.length-1;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[j] < a[i]){
					
					int temp = a[i];
					a[i]= a[j];
					a[j] = temp;
				}
			}
		}

		// In this we can find the  second largest , third largest , or smalles also 
		for(int x : a){
			System.out.println(x);
		}
	}

}
