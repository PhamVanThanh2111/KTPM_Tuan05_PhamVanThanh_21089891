package iuh.fit.se.ObserverPattern_Stock;

public interface Observer {
    void update(String stockName, double newPrice);
}
