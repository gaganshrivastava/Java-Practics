package arrays;

public class RowsNColsSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][] = {{1,2,3},
				{1,2,1},
				{1,9,3}};
		
		System.out.println("Matrix is ");
		for(int x[] : a){
			for(int y : x){
				System.out.print(y + " ");
			}
			System.out.println();
		}
		System.out.println();
		int rowSum[] = new int[a.length];
		int colSum[] = new int[a[0].length];
		for(int i = 0;i<a.length;i++){
			for(int j =0; j< a[0].length ; j++){
				rowSum[i] += a[i][j];
				colSum[i] += a[j][i];
			}
		}
		
		System.out.println(" Row sums : ");
		for(int x : rowSum){
			System.out.println(x + " ");
		}
		System.out.println();
		System.out.println(" Col sums : ");
		for(int x : colSum){
			System.out.print(x + " ");
		}
		
	}

}
