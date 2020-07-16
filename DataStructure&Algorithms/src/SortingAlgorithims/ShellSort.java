package SortingAlgorithims;

public class ShellSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 9, 8, 5, 4, 3, 2, 1 };
		int n = a.length;
		for(int gap= n/2 ; gap > 0; gap /=2){ // this loop is for the gap count 
			for (int x : a) {
				System.out.print(x + " ");
			}
			System.out.println();
			for(int i = gap ; i < n  ; i++ ){ // this is for traverse the half of the array
				int j = i; // is  for the pointeer at gap distant
				int temp = a[i];
				System.out.println(i + ", " + j);
				while(j >= gap  && (a[j-gap] > temp)){
					System.out.println("inwhile");
					//if(a[j-gap] > a[i]){
						a[j] = a[j-gap]; 
						j -=gap;
					//}
						System.out.println(i + ", " + j);
				}
				a[j] = temp;
			}
			
			System.out.println();
			
		}
		
		
		for (int x : a) {
			System.out.print(x + " ");
		}
		System.out.println();
		
		
	}

}
