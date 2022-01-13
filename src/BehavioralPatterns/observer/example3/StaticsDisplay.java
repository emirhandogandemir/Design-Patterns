package BehavioralPatterns.observer.example3;

public class StaticsDisplay implements Observer,DisplayElement{

   private float maxTemp=0.0F;
   private float minTemp=200;
   private float tempSum =0.0F;
   private int numReadings;
   private WeatherData weatherData;

   public StaticsDisplay(WeatherData weatherData){
       this.weatherData=weatherData;
       weatherData.registerObserver(this);
   }


    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = "+ (tempSum/numReadings) + " / " + maxTemp + " / "+minTemp);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
    tempSum+=temp;
    if (temp > maxTemp){
        maxTemp=temp;
    }
    if (temp< minTemp){
    minTemp=temp;
    }
    display();
    }
}
