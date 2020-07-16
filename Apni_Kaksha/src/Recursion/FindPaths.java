package Recursion;

public class FindPaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(path(4,4));
	}
	
	static int path(int row,int col){
		int p= 0;
		if(row==1 || col==1)
			return 1;
		if(row>1){
			p = p + path(row-1,col);
		}
		if(col>1){
			p = p + path(row,col-1);
		}
		return p;
		
		
		//return path(row-1, col) + path(row, col-1);
		
	}

}
