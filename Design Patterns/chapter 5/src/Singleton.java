public class Singleton 
{
	//make a static variable to hold the one instance of the class 
	private static Singleton uniqueInstance;
	
	//make a private constructor
	private Singleton() {}
	
	//make the static method, only it can instantiate 
	public static Singleton getInstance()
	{
		//the statement to ensure that it's only one instance
		if(uniqueInstance == null)
			uniqueInstance = new Singleton();
		
		return uniqueInstance;
	}
	
}
