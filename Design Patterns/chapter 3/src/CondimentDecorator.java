
public abstract class CondimentDecorator extends Beverage
{
	//HAS A reference to the component.
	Beverage beverage;
	
	//This method is differ from the getDescription of the Beverage class.
	public abstract String getDescription();

	
}
