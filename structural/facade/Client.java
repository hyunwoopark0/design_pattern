package pattern.structural.facade;

public class Client {
    public static void main(String[] args) {
        Service service = new Service();
        service.execute();
    }
}