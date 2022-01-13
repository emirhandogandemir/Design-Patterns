package BehavioralPatterns.observer.example3;

public interface Subject {
    void registerObserver(Observer observer);
    void removerObserver(Observer observer);
    void notifyObservers();
}
