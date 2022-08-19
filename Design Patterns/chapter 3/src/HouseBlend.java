//One of the concrete component of the decorator pattern.
public class HouseBlend extends Beverage
{
	public HouseBlend()
	{
		description = "House Blend";
	}
	
	public double cost()
	{
		return .89;
	}
}
