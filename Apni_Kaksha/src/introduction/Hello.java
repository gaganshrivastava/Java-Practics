package introduction;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome TO apni Kaksha");
		
		//to get the max value of data type
		System.out.println("maximum value of float =" + Float.MAX_VALUE);
		
		System.out.println("maximum value of char =" + Double.MAX_VALUE);
		
		//example of automatic type casting
		byte a= 4 ;
		int b = a;
		
		char x= (char) b;
		System.out.println("x = " + x);
		x = 'b';
		b = x;
		
		int REDIX=10;//redix 10 is for decimal number, for hexa use redix 16.
		char c=Character.forDigit(b,REDIX);
		long d = c; //give the ascii value
		System.out.println("Example of type csating a= " +  a );
		System.out.println("Example of type csating c= " +  c );
		System.out.println("Example of type csating d= " +  d );
		
		//manual type casting
		double e = 3.14;
		int myint = (int)e; // give the integer part , always give the floor value
		char mychar = (char)e; // give the ascii char
		System.out.println("interger of double = " + myint);
		System.out.println("char of double = " + mychar);
		
	//	String s = Integer.parseInt();
		
	}

}
