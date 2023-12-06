package pattern.behavioral.template;

public class Client {
    public static void main(String[] args) {
        Hambuger bulgogiBuger = new BulgogiBuger();
        Hambuger chickenBuger = new ChickenBuger();

        bulgogiBuger.make();
        chickenBuger.make();
    }

}