public abstract class CaffineBeverage {
	// Declare the method as 'final' to prevent the subclasses from changing the template method.
	final void prepareReciepe() {
		boilWater();
		brew();
		pourInCup();
		if(customerWantsCondiments()) {
			addCondiments();
		}
	}
	
	abstract void brew();
	
	abstract void addCondiments();
	
	void boilWater() 
	{System.out.println("Boiling water . . . !");}
	
	void pourInCup() 
	{System.out.println("Pouring in cup . . . !");}

	abstract boolean customerWantsCondiments();
}
