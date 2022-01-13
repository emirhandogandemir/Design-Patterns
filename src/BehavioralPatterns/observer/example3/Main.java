package BehavioralPatterns.observer.example3;

public class Main {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        StaticsDisplay staticsDisplay = new StaticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurement(80,65,30.4F);
        weatherData.setMeasurement(82,70,29.2F);
        weatherData.setMeasurement(78,90,29.2F);
    }


}
