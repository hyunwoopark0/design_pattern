package pattern.structural.decorator;

public class Client {
    public static void main(String[] args) {
        Hambuger hambuger = new BulgogiHambuger();

        Hambuger addSourceHambuger = new SourceDecorator(hambuger);
        addSourceHambuger.setting();

        Hambuger addCheezeHambuger = new CheezeDecorator(hambuger);
        addCheezeHambuger.setting();

        Hambuger addSourceAndCheezeHambuger = new SourceDecorator(new CheezeDecorator(hambuger));
        addSourceAndCheezeHambuger.setting();

    }
}
