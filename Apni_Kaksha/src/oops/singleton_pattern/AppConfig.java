package oops.singleton_pattern;

public class AppConfig {

	private AppConfig() {
		// TODO Auto-generated constructor stub
	}
	
/*	private static AppConfig obj = new AppConfig();*/
	private static AppConfig obj = null;  // this is beacuse when we don't need any nstance there is no obj created.
	
	//creating this to give the obj of the class as because 
	//externally we can't make the obje as constrcutor is private
	public static AppConfig getInstance(){
		if(obj == null ){
			obj = new AppConfig();
		}
		
		return obj;
	}
}
