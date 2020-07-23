package behavioral.observer.java;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
    List<Observer> obs = new ArrayList<>();

    public void addObserver(Observer observer) {
        obs.add(observer);
    }

    public void removeObserver(Observer observer) {
        obs.remove(observer);
    }

    public void notifyObservers() {
        notifyObservers(null);
    }

    public void notifyObservers(Object arg) {
        for (Observer observer : obs) {
            observer.update(this, arg);
        }
    }
}
