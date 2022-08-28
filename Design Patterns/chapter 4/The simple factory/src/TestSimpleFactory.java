public class TestSimpleFactory 
{
	public static void main(String[] args) 
	{
		SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
		simplePizzaFactory.createPizza("cheese");
		simplePizzaFactory.createPizza("clam");
		simplePizzaFactory.createPizza("plain");
		
		//The code above create three objects of the three classes
		//it prints:
		//This is cheese pizza
		//This is a clam pizza
		//This is a plain pizza!!!
		
	}

}
