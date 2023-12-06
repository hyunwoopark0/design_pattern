package pattern.structural.decorator;

public class BulgogiHambuger implements Hambuger{
    @Override
    public void setting() {
        System.out.println("불고기 버거 세팅");
    }
}