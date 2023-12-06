package pattern.behavioral.strategy;

public class Client {
    public static void main(String[] args) {
        // 컨텍스트 생성
        Context context = new Context();

        // 전략 교체 및 실행
        context.setSource(new ChiliSource());
        context.makeSource();

        context.setSource(new KetchupSource());
        context.makeSource();

        context.setSource(new MayonnaiseSource());
        context.makeSource();


    }
}