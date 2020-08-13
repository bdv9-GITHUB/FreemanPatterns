package observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private int pressure;
    private Subject weatherData;

    public void CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
    }

    @Override
    public void update(float temperature, float humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.print("Температура: " + temperature + "; ");
        System.out.print("Влажность: " + humidity + "; ");
        System.out.println("Давление: " + pressure);
    }
}
