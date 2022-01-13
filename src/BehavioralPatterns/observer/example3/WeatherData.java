package BehavioralPatterns.observer.example3;

import java.util.ArrayList;

public class WeatherData implements Subject{

    private ArrayList<Observer> observers ;
    private float temperature;
    private float humudity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
    getObservers().add(observer);
    }

    @Override
    public void removerObserver(Observer observer) {
    int i = observers.indexOf(observer);
    if(i>=0){
        observers.remove(observer);
    }
    }

    @Override
    public void notifyObservers() {
    for (Observer observer : observers){
        observer.update(temperature,humudity,pressure);
    }
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurement(float temperature, float humudity, float pressure){
        this.temperature=temperature;
        this.humudity=humudity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public ArrayList<Observer> getObservers() {
        return observers;
    }

    public void setObservers(ArrayList<Observer> observers) {
        this.observers = observers;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumudity() {
        return humudity;
    }

    public void setHumudity(float humudity) {
        this.humudity = humudity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
}
