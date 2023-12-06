package pattern.creational.methodf;

public class BulgogiFactory extends Factory{
    @Override
    protected Hambuger createHambuger() {
        return new Bulgogi();
    }
}