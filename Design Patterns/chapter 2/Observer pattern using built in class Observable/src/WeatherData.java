import java.util.Observable;

@SuppressWarnings("deprecation")

public class WeatherData extends Observable
{
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {} //empty constructor.
	
	public void measurementsChanged()
	{
		//Before notify the observers, first change the state of changed flag to true.
		setChanged();
		notifyObservers();
	}
	
	
	public void setMeasurements(float temperature, float humidity, float pressure)
	{
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	
	public float getTemperature() {
		return temperature;
	}
	
	public float getHumidity() {
		return humidity;
	}
	
	public float getPressure() {
		return pressure;
	}
	
	
}
