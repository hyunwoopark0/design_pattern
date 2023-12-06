package pattern.structural.decorator;

public class SourceDecorator extends HambugerDecorator{
    public SourceDecorator(Hambuger hambuger) {
        super(hambuger);
    }

    @Override
    public void setting() {
        super.setting();
        sourceTopping();
    }

    private void sourceTopping(){
        System.out.println("소스 토핑 추가");
    }
}
