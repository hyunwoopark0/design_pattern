package pattern.behavioral.template;

public class ChickenBuger extends Hambuger{

    @Override
    protected void breadProcess() {
        System.out.println("일반 빵 세팅");
    }

    @Override
    protected void pattyProcess() {
        System.out.println("치킨 패티 세팅");
    }

    @Override
    protected boolean hook(){
        return  false;
    }

    @Override
    protected void sourceProcess() {
        System.out.println("소스 없이 ");
    }
}
