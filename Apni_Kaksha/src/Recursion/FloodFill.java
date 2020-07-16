package Recursion;

public class FloodFill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// fill the bunch of numbers which are connected with the given number.
		
		int a[][]= {{1,2,0,1},
					{1,2,0,1},
					{1,2,0,1},
					{1,2,0,1}};
		
		fillFlood(a, 1, 0, 4, 1);
		printMatrix(a);
	
		
		}
	
	public static void fillFlood(int a[][], int r, int c, int toFill, int prevFill){
		int rows = a.length;
		int col = a[0].length;
		
		if(r<0 || r>= rows  || c< 0 || c >= col ){
			return;
		}
		
		if(a[r][c] != prevFill){
			return;
		}
		
		a[r][c] = toFill;
		fillFlood(a, r-1, c, toFill, prevFill); // for the upper side same col
		fillFlood(a, r+1, c, toFill, prevFill); // for the lower side same col
		fillFlood(a, r, c+1, toFill, prevFill); //
		fillFlood(a, r, c-1, toFill, prevFill);
		
	}
	
	
	static void printMatrix(int a[][]){
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length; j++){
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
	}


