package pattern.behavioral.visitor;

public interface Visitable {
    public void accept(Visitor visitor);
}