package pattern.behavioral.strategy;

public class MayonnaiseSource implements SourceStrategy{

    @Override
    public void makeSource() {
        System.out.println("마요네즈 소스 알고리즘");
    }
}
