package pattern.behavioral.state;

public class Bulgogi implements HambugerState{

    @Override
    public void sourceSetting(Context context) {
        System.out.println("bulgogi source setting");
    }
}
