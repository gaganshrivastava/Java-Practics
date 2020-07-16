package oops;

public class PassByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = 34;
		int d = 25;
		
		System.out.println("For  Primitive Data type");
		System.out.println("Before swapping");
		System.out.println(c + "=c " );
		System.out.println(d + "=d " );
		swap(c,d);
		System.out.println();
		System.out.println("After swapping also values wil be same as it is makng the new alias and swpping is done in the local scope");
		System.out.println(c + "=c " );
		System.out.println(d + "=d " );//it wont swap as it is pass by value
		
		System.out.println();
		System.out.println();
		//pass by value for non premivtive data type
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		
		d1.legs = 3;
		d2.legs = 4;
		
		System.out.println("For Non Primitive Data type");
		System.out.println("Before swapping with dog");
		System.out.println("D1 legs = " + d1.legs ); 
		System.out.println("D2 legs = " + d2.legs ); 
		System.out.println();
		swap(d1.legs,d2.legs); // in this we pass the reference of the object(means base address of the object is passed)
		System.out.println("D1 legs = " + d1.legs ); 
		System.out.println("D2 legs = " + d2.legs ); 
		System.out.println("After  swapping with dog , SO the value will remin same as the swpping is done locally within the scope of that function");
		
		//call by refernce and chnange the value of d1
		System.out.println();
		System.out.println();
		System.out.println("changing the value of legs in dog D1 ");
		System.out.println("Before calling chnage DOg, D1 legs = " + d1.legs);
	changeDog(d1);
	System.out.println("After calling chnage DOg, D1 legs = " + d1.legs);
		

	}
	
	static void swap(int a, int b){
		//so the value is swapped in the locally 
		int temp = a;
		a = b;
		b = temp;
	}
	
	static void swap(Dog a, Dog b){ //a = &d1 , b = &d2
		//so the value is swapped in the locally 
		Dog temp = a;
		a = b;
		b = temp;
	}
	
	static void changeDog(Dog a){
		a.legs = 10;
	//	return a;
		
	}

}


class Dog{
	int legs ;
	
}