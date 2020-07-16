package oops.Exception;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 110;
			//int b = a/0;
			
			
		//	System.out.println(b + " = b");
		}catch(Exception e){
			System.out.println(e.getMessage() + " error occiured awww");
		}finally {
			System.out.println("This  will run by default");
		}
		
		
		System.out.println("Code still running");
		
		fun();
	}

	static void fun(){
		try{
			fun2();
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Error occured");
		}
		
	}
	
	//throws will check that it will thorow the eceperion and should be handled
	static void fun2() throws ArrayIndexOutOfBoundsException{

		boolean flag = true;
		if(flag){
			throw new ArrayIndexOutOfBoundsException("aaaa");
		}
	}
}
