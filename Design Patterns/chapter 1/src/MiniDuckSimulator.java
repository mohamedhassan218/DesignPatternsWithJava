public class MiniDuckSimulator 
{
	public static void main(String[] args) 
	{
		Duck mallardDuck = new MallardDuck();
		mallardDuck.performQuack();                   //prints: I'm quacking
		mallardDuck.performFly();                     //prints: I am flying!!
		

		Duck model = new ModelDuck();                 		//model duck doesn't fly.
		model.performFly();                           		//prints: I can't fly.
		model.setFlyBehavoir(new FlyRocketPowered()); 		//change the fly behavior to enable it to fly.
		model.performFly();                           		//prints: I am flying with a rocket.
		

	}

}
