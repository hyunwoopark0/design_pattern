package pattern.structural.decorator;

public class CheezeDecorator extends HambugerDecorator{
    public CheezeDecorator(Hambuger hambuger) {
        super(hambuger);
    }

    @Override
    public void setting() {
        super.setting();
        cheezeTopping();
    }

    private void cheezeTopping(){
        System.out.println("치즈 토핑 추가");
    }
}
