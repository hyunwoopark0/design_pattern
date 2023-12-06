package pattern.structural.proxy;

public class RealSubject implements Subject{
    @Override
    public void execute() {
        System.out.println("real execute");
    }
}