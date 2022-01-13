package BehavioralPatterns.observer.example3;

public class ForecastDisplay implements Observer, DisplayElement{

    private float currentPressure=12.112F;
    private float lastPressure;
    private WeatherData weatherData;
    public ForecastDisplay(WeatherData weatherData){
        this.weatherData=weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Forecast");
        if (currentPressure>lastPressure){
            System.out.println("Improving weather on the way");
        }
        else if (currentPressure == lastPressure){
            System.out.println("More the same");
        }
        else if (currentPressure<lastPressure){
            System.out.println("Watch out for cooler , rainy weather");
        }
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        lastPressure=currentPressure;
        currentPressure=pressure;
        display();
    }
}
