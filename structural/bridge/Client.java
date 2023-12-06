package pattern.structural.bridge;

public class Client {
    public static void main(String[] args) {
        Sedan sedan = new Sedan(new Diesel());
        Suv suv = new Suv(new Gasoline());

        sedan.run();
        suv.run();

        sedan.stop();
        suv.stop();

        sedan.onlySedan();
        suv.onlySuv();
    }
}
