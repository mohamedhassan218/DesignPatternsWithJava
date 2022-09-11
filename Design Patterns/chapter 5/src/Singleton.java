public class Singleton 
{
	//make a static variable to hold the one instance of the class 
	private static Singleton uniqueInstance;
	
	//make a private constructor
	private Singleton() {}
	
	//make the static method, only it can instantiate 
	//IMPORTANT NOTE:
	//by adding the synchronized keyword to the getInstance(), we force every thread to 
	//wait its turn before it can enter the method.
	//After doing that, no two threads may enter the method at the same time.
	public static synchronized Singleton getInstance()
	{
		//the statement to ensure that it's only one instance
		if(uniqueInstance == null)
			uniqueInstance = new Singleton();
		
		return uniqueInstance;
	}
	
}
