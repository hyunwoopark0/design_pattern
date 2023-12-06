package pattern.behavioral.visitor;

public class Bicycle implements Visitable{

    private String name = "bicycle";

    public String getName(){
        return this.name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}