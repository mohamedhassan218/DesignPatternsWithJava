//The component class in the decorator pattern.
public abstract class Beverage 
{
	String description = "Unknown Beverage";
	
	public String getDescription()
	{
		return description;
	}
	
	public abstract double cost();

}
