package pattern.behavioral.chain;

public class TakeHandler extends Handler{
    @Override
    protected void check(Hambuger hambuger) {
        System.out.println("take setting check");
    }
}