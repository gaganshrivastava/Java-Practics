package oops.Abstraction;

public class ReparShop {

/*	public static void repairCar(WagonR car){
		System.out.println("Car repeared ");
	}
	
	public static void repairCar(Audi car){
		System.out.println("Car repeared ");
	}*/
	
	public static void repairCar(Car car){
		System.out.println("Car repeared ");
	}
	
	public static void main(String[] args){
		WagonR  w = new WagonR();
		Audi a = new Audi();
		
		repairCar(w);
		w.accelerate();
		repairCar(a);
		
	}
}
