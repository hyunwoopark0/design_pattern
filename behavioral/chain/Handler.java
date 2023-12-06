package pattern.behavioral.chain;

public abstract class Handler {

    private Handler nextHandler = null;

    public final void handleRequest(Hambuger hambuger){
        check(hambuger);
        if(nextHandler != null) nextHandler.handleRequest(hambuger);
    }

    protected abstract void check(Hambuger hambuger);

    public final Handler setNextHandler(Handler nextHandler){
        this.nextHandler = nextHandler;
        return nextHandler;
    }

}