package Collections.List;
//<X , Y> are the generics type so that when we make the object we can make the pair with that.
// so that when we pass the value of any data type
public class Pairs<X,Y> {
	
	X  x;
	Y y;
	
	public Pairs(X x, Y y){
		//upar vala x = parameter vala x
		this.x = x;
		this.y = y;
	}
	
	public void show(){
		System.out.println(x + " " + y);
	}
	
	

}
