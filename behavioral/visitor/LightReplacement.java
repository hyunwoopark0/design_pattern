package pattern.behavioral.visitor;

public class LightReplacement implements Visitor{
    @Override
    public void visit(Car car) {
        System.out.println(car.getName() + " light replacement");
    }

    @Override
    public void visit(Bicycle bicycle) {
        System.out.println(bicycle.getName() + " light replacement");
    }
}