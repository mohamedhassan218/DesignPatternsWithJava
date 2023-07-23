//First, we implement the interface of the type we're adapting to.
//This is the interface your client expects to see:(Duck)
public class TurkeyAdapter implements Duck 
{
	Turkey turkey;
 
	//We need to get a reference to the object that we're adapting.
	//We do that through the constructor:
	public TurkeyAdapter(Turkey turkey) 
	{
		this.turkey = turkey;
	}
    
	//Here, it gobbles instead of quacking:
	public void quack() 
	{
		turkey.gobble();
	}
  
	//Turkey's fly is different:
	public void fly() 
	{
		for(int i=0; i < 5; i++) 
		{
			turkey.fly();
		}
	}
}
