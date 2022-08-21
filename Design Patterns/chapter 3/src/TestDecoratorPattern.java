
public class TestDecoratorPattern 
{

	public static void main(String[] args) 
	{
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
		//Prints: Espresso $1.99
		
		beverage = new Mocha(beverage);
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
		//Prints: Espresso, Mocha $2.19
		
		beverage = new Whip(beverage);
		beverage = new Mocha(beverage);
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
		//Prints: Espresso, Mocha, Whip, Mocha $2.49
		
	}

}
