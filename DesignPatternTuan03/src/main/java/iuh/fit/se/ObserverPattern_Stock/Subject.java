package iuh.fit.se.ObserverPattern_Stock;

public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
