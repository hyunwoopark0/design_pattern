package pattern.structural.bridge;

public class Diesel implements Engine{
    @Override
    public void on() {
        System.out.println("disel on");
    }

    @Override
    public void off() {
        System.out.println("disel off");
    }
}
