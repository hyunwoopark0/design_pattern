package pattern.structural.proxy;

public class Proxy implements Subject{

    private Subject subject;
    boolean check;

    public Proxy(boolean check){
        this.check = check;
    }


    @Override
    public void execute() {
        // 지연 초기화
        if (subject == null ){
            subject = new RealSubject();
        }
        // 접근 권한
        if (this.check){
            // logging
            System.out.println("---logging start---");

            // proxy 객체의 작업
            System.out.println("porxy execute");

            //실제 주체의 행동
            subject.execute();
            System.out.println("---logging end---");
        }
    }
}
