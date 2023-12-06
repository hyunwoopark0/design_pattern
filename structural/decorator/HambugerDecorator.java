package pattern.structural.decorator;

public class HambugerDecorator implements Hambuger{
    Hambuger hambuger;
    public HambugerDecorator(Hambuger hambuger){
        this.hambuger = hambuger;
    }

    @Override
    public void setting() {
        hambuger.setting();
    }
}
