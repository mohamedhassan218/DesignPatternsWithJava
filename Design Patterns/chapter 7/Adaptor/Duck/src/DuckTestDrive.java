
public class DuckTestDrive 
{
	public static void main(String[] args) 
	{
		//create a duck:
		Duck duck = new MallardDuck();

		//create a turkey:
		Turkey turkey = new WildTurkey();
		
		//here, we test the adaptor:
		Duck turkeyAdapter = new TurkeyAdapter(turkey);

		System.out.println("The Turkey says...");
		turkey.gobble();
		turkey.fly();

		System.out.println("\nThe Duck says...");
		testDuck(duck);

		System.out.println("\nThe TurkeyAdapter says...");
		testDuck(turkeyAdapter);
		
		
	}

	//method gets a duck and calls its quack and quack() and fly() methods:
	static void testDuck(Duck duck) 
	{
		duck.quack();
		duck.fly();
	}
}
