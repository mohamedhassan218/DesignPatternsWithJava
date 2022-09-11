//we make this class to avoid the synchronized and ensure it won't make errors
public class EagerlySingleton 
{
	
	//this code is guaranteed to be thread safe 
	private static EagerlySingleton uniqueInstance = new EagerlySingleton();
	
	private EagerlySingleton() {}
	
	public static EagerlySingleton getInstance()
	{
		return uniqueInstance;
	}
}
