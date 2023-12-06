package pattern.structural.flyweight;

public class Hambuger {
    private String source;
    private String patty;
    private SharedHambuger sharedHambuger;

    public Hambuger(String source, String patty, SharedHambuger sharedHambuger){
        this.source = source;
        this.patty = patty;
        this.sharedHambuger = sharedHambuger;
    }

    @Override
    public String toString() {
        return "Hambuger{" +
                "source='" + source + '\'' +
                ", patty='" + patty + '\'' +
                ", sharedHambuger=" + sharedHambuger +
                '}';
    }
}
