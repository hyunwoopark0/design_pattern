package pattern.behavioral.visitor;

public class Car implements Visitable{

    private String name = "car";

    public String getName(){
        return this.name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
