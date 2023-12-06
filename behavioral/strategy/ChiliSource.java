package pattern.behavioral.strategy;

public class ChiliSource implements SourceStrategy {

    @Override
    public void makeSource() {
        System.out.println("칠리 소스 알고리즘");
    }
}
