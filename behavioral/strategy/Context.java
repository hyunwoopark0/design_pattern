package pattern.behavioral.strategy;

public class Context {
    SourceStrategy source;

    public void setSource(SourceStrategy source){
        this.source = source;
    }
    public void makeSource(){
        this.source.makeSource();
    }

}
