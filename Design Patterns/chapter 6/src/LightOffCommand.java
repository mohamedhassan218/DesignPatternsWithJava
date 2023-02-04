
public class LightOffCommand implements Command 
{
	Light light;
 
	public LightOffCommand(Light light) 
	{
		this.light = light;
	}
 
	public void execute() 
	{
		light.off();
	}
	
	//turns the light back on:
	public void undo()
	{
		light.on();
	}
}
