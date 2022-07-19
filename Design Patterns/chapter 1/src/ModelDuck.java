public class ModelDuck extends Duck 
{
	public ModelDuck() 
	{
		flyBehavoir = new FlyNoWay();
		quackBehavoir = new Quack();
	}
	
	public void display()
	{
		System.out.println("I'm a model duck!");
	}

}
