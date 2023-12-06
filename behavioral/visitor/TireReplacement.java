package pattern.behavioral.visitor;

public class TireReplacement implements Visitor{
    @Override
    public void visit(Car car) {
        System.out.println(car.getName() + " tire replacement");
    }

    @Override
    public void visit(Bicycle bicycle) {
        System.out.println(bicycle.getName() + " tire replacement");
    }
}