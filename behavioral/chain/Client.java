package pattern.behavioral.chain;

public class Client {

    public static void main(String[] args) {
        Handler handler = new SourceHandler();
        handler .setNextHandler(new NapkinHandler())
                .setNextHandler(new TakeHandler());

        handler.handleRequest(new Hambuger("bulgogi", "fride", "coke"));

    }
}
