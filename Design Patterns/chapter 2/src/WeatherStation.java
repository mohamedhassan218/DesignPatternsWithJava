
public class WeatherStation 
{
	
	public static void main(String[] args)
	{
		//First take an object of the weatherData class.
		WeatherData weatherData = new WeatherData();
		
		//Taking objects from any display U want to register it with the weatherData (the Subject)
		//and pass the weatherData object to the constructors.
		CurrentConditionsDisplay currentConditionsDisplay  = new CurrentConditionsDisplay(weatherData);
		HeatIndexDisplay heatIndexDisplay  = new HeatIndexDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		
		
		
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
		
	}

}
