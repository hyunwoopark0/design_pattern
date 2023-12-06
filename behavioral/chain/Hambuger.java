package pattern.behavioral.chain;

public class Hambuger {
    private String name;
    private String side;
    private String beverage;

    Hambuger(String name, String side, String beverage){
        this.name = name;
        this.side = side;
        this.beverage = beverage;
    }

    public String getName() {
        return name;
    }

    public String getSide() {
        return side;
    }

    public String getBeverage() {
        return beverage;
    }

}
