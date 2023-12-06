package pattern.structural.bridge;

public class Sedan extends Car{
    public Sedan(Engine engine) {
        super(engine);
    }

    public void onlySedan(){
        System.out.println("only sedan method");
    }
}

