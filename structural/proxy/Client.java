package pattern.structural.proxy;

public class Client {
    public static void main(String[] args) {
        Subject subject = new Proxy(true);
        subject.execute();
    }
}
