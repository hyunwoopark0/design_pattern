package pattern.structural.adapter;

public class Client {
    public static void main(String[] args) {
        OrginService adapter = new Adaptor(new ThirdParty());
        adapter.execute();
    }
}