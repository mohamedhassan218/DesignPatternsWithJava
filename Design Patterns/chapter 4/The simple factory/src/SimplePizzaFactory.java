public class SimplePizzaFactory 
{
	//method to create the pizza during the runtime 
	//this method is often declared statically
	public Pizza createPizza(String type)
	{
		Pizza pizza = null;
		if(type.equals("cheese"))
			pizza = new CheesePizza();
		else if(type.equals("clam"))
			pizza = new ClamPizza();
			
		return pizza;
	}
}
