package pattern.structural.bridge;

public class Gasoline implements Engine{
    @Override
    public void on() {
        System.out.println("gasoline on");
    }

    @Override
    public void off() {
        System.out.println("gasoline off");
    }
}
