package pattern.behavioral.strategy;

public class KetchupSource implements SourceStrategy{

    @Override
    public void makeSource() {
        System.out.println("케찹 소스 알고리즘");
    }
}
