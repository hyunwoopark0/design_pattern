package pattern.behavioral.template;

public class BulgogiBuger extends Hambuger {

    @Override
    protected void breadProcess() {
        System.out.println("일반 빵 세팅");
    }

    @Override
    protected void pattyProcess() {
        System.out.println("불고기 패티 세팅");
    }

    @Override
    protected void sourceProcess() {
        System.out.println("불고기 소스 세팅");
    }
}