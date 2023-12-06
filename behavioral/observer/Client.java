package pattern.behavioral.observer;

public class Client {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();

        Observer observer1 = new Observer1();
        Observer observer2 = new Observer2();

        subject.subscribeObserver(observer1);
        subject.subscribeObserver(observer2);

        subject.notifyObserver();

        subject.cancleSubscribe(observer1);

        subject.notifyObserver();
    }
}