package pattern.creational.methodf;

public abstract class Factory {
    final Hambuger createOperation(){
        Hambuger hambuger = createHambuger();
        return hambuger;
    }

    abstract protected Hambuger createHambuger();
}