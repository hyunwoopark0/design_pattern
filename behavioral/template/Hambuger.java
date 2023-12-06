package pattern.behavioral.template;

abstract class Hambuger {
    public final void make(){
        //공통 전처리

        breadProcess();
        pattyProcess();

        // 유연성
        if(hook()){
            sourceProcess();
        }

        //공통 후처리
    }

    boolean hook(){
        return true;
    }
    protected abstract void breadProcess();
    protected abstract void pattyProcess();
    protected abstract void sourceProcess();
}