package pattern.creational.abstractf;

public class AsetFactory implements SetMenuFactory{
    @Override
    public Hambuger createHambuger() {
        return new Bulgogi();
    }

    @Override
    public Side createSide() {
        return new FrenchFries();
    }
}