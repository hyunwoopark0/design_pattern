package pattern.creational.abstractf;

public class BsetFactory implements SetMenuFactory{
    @Override
    public Hambuger createHambuger() {
        return new Cheeze();
    }

    @Override
    public Side createSide() {
        return new ChickenNuggets();
    }
}