package iuh.fit.se.ObserverPattern_Task;

import java.util.ArrayList;
import java.util.List;

public class Task implements TaskSubject {
    private String name;
    private String status;
    private List<TaskObserver> observers = new ArrayList<>();

    public Task(String name, String status) {
        this.name = name;
        this.status = status;
    }

    public void setStatus(String newStatus) {
        this.status = newStatus;
        notifyObservers();
    }

    @Override
    public void addObserver(TaskObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(TaskObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (TaskObserver observer : observers) {
            observer.update(name, status);
        }
    }
}
