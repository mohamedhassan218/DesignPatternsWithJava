import java.util.ArrayList;

public class WeatherData implements Subject
{
	//the attributes of the WeatherData object.
	private ArrayList<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	//constructor of the WeatherData object.
	public WeatherData()
	{
		observers = new ArrayList<Observer>();
	}
	
	//adding observer to the list of observers.
	public void registerObserver(Observer o)
	{
		observers.add(o);
	}
	
	
	public void removeObserver(Observer o)
	{
		int indx = observers.indexOf(o);
		
		//check if the item in the list or not.
		if(indx >= 0)
			observers.remove(indx);
	}

	public void notifyObservers()
	{
		//update all observers in the list with the new data.
		for(Observer observer : observers)
			observer.update(temperature, humidity, pressure);
	}
	
	public void measurementsChanged()
	{
		//notify the observers when we get 
		//updated measurements from the weather station.
		notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure)
	{
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		//each time U change the attributes, the notifyObservers called by the measurementsChanged method.
		measurementsChanged();
	}
	
	//You can add other WeatherData methods here.
}
