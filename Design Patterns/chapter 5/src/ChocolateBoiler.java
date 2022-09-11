public class ChocolateBoiler 
{
	//implement the singleton pattern: 
	
	private boolean empty;
	private boolean boiled;
	
	//note: uniqueInstance must be static
	private static ChocolateBoiler uniqueInstance;
	
	//constructor started when the boiler is empty
	//note: the constructor is private:
	private ChocolateBoiler()
	{
		empty = true; 
		boiled = false;
	}
	
	//Now, you have to make a static method
	public static ChocolateBoiler getInstnace()
	{
		if(uniqueInstance == null)
			uniqueInstance = new ChocolateBoiler();
			
		return uniqueInstance;
	}
	
	
	
	public void fill()
	{
		//to fill the boiler, it must be empty
		if(isEmpty())
		{
			empty = false;
			boiled = false;
			//fill it with the mixture of milk\chocolate
		}
	}
	
	public void drain()
	{
		//to drain ===> make it empty and take the mixture to the market
		//to drain the boiler it must be full:
		//(non empty and also boiled)
		if(!isEmpty() && isBoiled())
			empty = true;
	}

	
	public void boil()
	{
		//to boil the mixture, the boiler must be fill and not boiled
		if(!isEmpty() && !isBoiled())
			boiled = true;
	}
	
	public boolean isEmpty()
	{
		return empty;
	}

	public boolean isBoiled()
	{
		return boiled;
	}

}
