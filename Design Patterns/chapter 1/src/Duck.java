public abstract class Duck                 //abstract class that all ducks inherits it.
{
	
	FlyBehavior flyBehavoir;               //declare two references variables for the
	QuackBehavior quackBehavoir;           // behavior interface type.
	
	public Duck()                          //Constructor of the superclass duck.
	{
		
	}
	
	public abstract void display();        //Abstract function (it's implementation changes from each subclass).
	
	public void performFly()
	{
		flyBehavoir.fly();
	}
	
	public void performQuack()
	{
		quackBehavoir.quack();
	}
	
	public void swim()
	{
		System.out.println("All ducks float, even decoys!");
	}

	public void setFlyBehavoir(FlyBehavior fb) //to set fly behavior dynamically.
	{
		flyBehavoir = fb;
	}
	
	public void setQuackBehavoir(QuackBehavior qb) // to set quack behavior dynamically.
	{
		quackBehavoir = qb;
	}
	
}
