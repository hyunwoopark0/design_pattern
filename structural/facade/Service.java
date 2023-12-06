package pattern.structural.facade;

public class Service {

    private final SubSystem1 subSystem1;
    private final SubSystem2 subSystem2;
    private final SubSystem3 subSystem3;

    public Service() {
        this.subSystem1 = new SubSystem1();
        this.subSystem2 = new SubSystem2();
        this.subSystem3 = new SubSystem3();
    }

    public void execute(){
        this.subSystem1.execute();
        this.subSystem2.execute();
        this.subSystem3.execute();
    }
}
