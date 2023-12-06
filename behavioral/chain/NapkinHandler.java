package pattern.behavioral.chain;

public class NapkinHandler extends Handler{
    @Override
    protected void check(Hambuger hambuger) {
        System.out.println("Napkin setting check");
    }
}