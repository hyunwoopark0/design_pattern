package pattern.creational.singleton;

public class Singleton {

    private Singleton(){}

    private static class Innerclass {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){
        return Innerclass.INSTANCE;
    }
}