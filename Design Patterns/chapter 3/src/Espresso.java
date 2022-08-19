//One of the concrete components in our decorator pattern.
public class Espresso extends Beverage
{
	public Espresso()
	{
		description = "Espresso";
	}

	//have to implement it's own cost.
	public double cost()
	{
		return 1.99;	
	}
	
}
