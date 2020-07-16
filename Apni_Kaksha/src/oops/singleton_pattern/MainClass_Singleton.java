package oops.singleton_pattern;

public class MainClass_Singleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*		AppConfig ac = new AppConfig();*/
	
		//different object created and stored in differnt memeory location
		///every time deafult constructor is called
/*		AppConfig ac1 = new AppConfig();*/
		
		
		//but we want to make the one object of config class and set all the thing in tht object.
		// so that it will call ocnce and set the properties once only.
		
		//to do this we mak the default constructor as private.
		// by that we are making single instances of that file.
		
		
		//get instance() is a static function so it ca be callled direclty by class.
		AppConfig ac = AppConfig.getInstance();
		
		AppConfig ac2 = AppConfig.getInstance();
		//now by declaring this we are accessing the same obj of the aapp config class.
		//save memory by this .
		
		
		
	}

}
