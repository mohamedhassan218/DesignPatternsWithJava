public class ChicagoStyleCheesePizza extends Pizza
{
	
	public ChicagoStyleCheesePizza()
	{
		
		name = "Chicago Style deep dish cheese pizza";
		dough = "Extra thick crust dough";
		sauce = "Plum tomato sauce";
		toppings.add("Shredded Mozzarella cheese");
		
	}
	
	@Override
	void cut()
	{
		System.out.println("Cutting the pizza into square slices");
	}

}
