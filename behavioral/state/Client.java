package pattern.behavioral.state;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.sourceSetting();

        context.setHambugerState(new Cheeze());
        context.sourceSetting();

    }
}
