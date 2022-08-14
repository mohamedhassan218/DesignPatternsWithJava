
public class CurrentConditionsDisplay implements Observer, DisplayElement
{
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	//when U take an currentConditionDisplay object, the constructor pass the 
	//weatherData object and we use it to register the display as an observer.
	public CurrentConditionsDisplay(Subject weatherData)
	{
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	public void update(float temperature, float humidity, float pressure)
	{
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}
	
	//Note:
	//the display method just display the recent temperature and humidity.
	public void display()
	{
		System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
	}

}
