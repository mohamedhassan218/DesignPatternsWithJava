//we make this class to avoid the synchronized and ensure it won't make errors
public class DoubleCheckedSingleton 
{
	//volatile keyword ensures that multiple threads handle the 
	//uniqueInstance variable correctly when it's being 
	//initialized to the DoubleCheckedSingleton instance.
	private volatile static DoubleCheckedSingleton uniqueInstance;
	
	private DoubleCheckedSingleton() {}
	
	public static DoubleCheckedSingleton getInstance()
	{
		//check for an instance and if there's one, enter the synchronized block
		if(uniqueInstance == null)
		{
			synchronized(DoubleCheckedSingleton.class)
			{
				//once the block, check again and if still null, create an instance
				if(uniqueInstance == null)
					uniqueInstance = new DoubleCheckedSingleton();
			}
		}
		
		return uniqueInstance;
	}
}
