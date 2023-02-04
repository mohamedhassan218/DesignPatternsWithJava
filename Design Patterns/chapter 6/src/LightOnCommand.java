//This is a concrete command:

public class LightOnCommand implements Command 
{
	Light light;

	public LightOnCommand(Light light) 
	{
		this.light = light;
	}

	public void execute() 
	{
		light.on();
	}
	
	//turns the light back off:
	public void undo()
	{
		light.off();
	}
}
