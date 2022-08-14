//observer interface is implemented by all observers.
//all observers have to implement the update method.
public interface Observer 
{
	public void update(float temp, float humidity, float pressure);
}
