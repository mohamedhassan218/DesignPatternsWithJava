
public class PizzaTestDrive 
{
	public static void main(String[] args)
	{
		//first we create two different stores:
		PizzaStore nyStore = new NYStylePizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		
		//then use each store to make orders:
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Mohamed ordered a " + pizza.getName() + "\n");
		
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Ahmed ordered a " + pizza.getName() + "\n");
		
	}

}
