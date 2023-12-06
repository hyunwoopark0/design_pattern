package pattern.creational.methodf;

public class ShanghaiChickenFactory extends Factory{
    @Override
    protected Hambuger createHambuger() {
        return new ShanghaiChicken();
    }
}
