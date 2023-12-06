package pattern.behavioral.chain;

public class SourceHandler extends Handler{
    @Override
    protected void check(Hambuger hambuger) {
        if (hambuger.getSide().equals("fride")){
            System.out.println("ketchup setting check");
        }
        else{
            System.out.println("source setting check");
        }
    }
}

