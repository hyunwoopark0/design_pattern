package pattern.creational.methodf;

public class Client {
    public static void main(String[] args) {

        Factory bulgogiFactory = new BulgogiFactory();

        Hambuger hambuger = bulgogiFactory.createOperation();

        hambuger.setting();
    }

}