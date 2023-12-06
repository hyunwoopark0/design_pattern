package pattern.behavioral.observer;

public interface Subject {
    void subscribeObserver(Observer observer);
    void cancleSubscribe(Observer observer);
    void notifyObserver();
}