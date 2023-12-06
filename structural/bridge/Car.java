package pattern.structural.bridge;

public abstract class Car {
    private Engine engine;

    public Car(Engine engine){
        this.engine = engine;
    }

    public void run(){
        engine.on();
    }

    public void stop(){
        engine.off();
    }
}