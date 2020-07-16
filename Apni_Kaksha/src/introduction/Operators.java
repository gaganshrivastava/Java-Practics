package introduction;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 50;
		int c = 6;
		
		//divide operator
		double divide = (double)a / (double)c ;
		System.out.println("On dividing =" + divide);
		
		//modulas operator
		int reminder = a%c ;
		System.out.println("On dividing  reminder is =" + reminder);
		
		//increment operator
		int d = c++;
		int b = ++a;
		System.out.println("On increment c new value=" + c);
		System.out.println("On increment c old  value=" + d);
		
		System.out.println("On increment a new value=" + a);
		System.out.println("On increment a old  value=" + b);
		
		//Bitwise operator
		b = 6;
		d = b >> 1 ;//(by one bit)  //011 >>3  (every right shift operator will divie the variable by 2 and take the floor value)
		int e = b << 1;
		System.out.println("On right shit of 6=" + d);
		System.out.println("On left shift of 6=" + e);
		
		
		int num = 550;
		System.out.println("Total digits  = " + ((int) Math.log10(num) +1));
	}

}
