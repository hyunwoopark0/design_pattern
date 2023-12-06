package pattern.creational.abstractf;

public class Client {
    public static void main(String[] args) {
        SetMenuFactory setMenuFactory = null;

        setMenuFactory = new AsetFactory();
        Hambuger hambuger = setMenuFactory.createHambuger();

        setMenuFactory = new BsetFactory();
        Side side = setMenuFactory.createSide();
    }
}