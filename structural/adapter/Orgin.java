package pattern.structural.adapter;

public class Orgin implements OrginService{
    @Override
    public void execute() {
        System.out.println("Orgin service execute");
    }
}