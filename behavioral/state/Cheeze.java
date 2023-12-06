package pattern.behavioral.state;

public class Cheeze implements HambugerState{

    @Override
    public void sourceSetting(Context context) {
        System.out.println("cheeze source setting");
    }
}