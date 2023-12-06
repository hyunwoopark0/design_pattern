package pattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject{

    List<Observer> observerList = new ArrayList<>();

    @Override
    public void subscribeObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void cancleSubscribe(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : observerList){
            observer.update();
        }
    }
}
