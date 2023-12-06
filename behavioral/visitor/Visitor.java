package pattern.behavioral.visitor;

public interface Visitor {
    public void visit(Car car);
    public void visit(Bicycle bicycle);
}