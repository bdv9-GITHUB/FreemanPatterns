package observer;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();
        weatherData.registerObserver(currentConditionsDisplay);
        weatherData.registerObserver(new CurrentConditionsDisplay());

        weatherData.setMeasurements(1.1f, 2.2f, 3);
        weatherData.setMeasurements(11.1f, 22.2f, 33);
        weatherData.setMeasurements(111.1f, 222.2f, 333);
    }
}
