package pattern.behavioral.state;

public class Context {
    private HambugerState hambugerState;

    public Context(){
        hambugerState = new Bulgogi();
    }

    public void setHambugerState(HambugerState hambugerState){
        this.hambugerState = hambugerState;
    }

    public void sourceSetting(){
        hambugerState.sourceSetting(this);
    }
}