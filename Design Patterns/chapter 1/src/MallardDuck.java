
public class MallardDuck extends Duck 
{
	public MallardDuck()                          //the constructor.
	{
		quackBehavoir = new Quack();                   
		flyBehavoir = new FlyWithWings();              
	}
	
	public void display()                              //implement the abstract method.
	{
		System.out.println("I'm a real Mallard duck!");
	}

}
