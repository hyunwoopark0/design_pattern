package pattern.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Visitable> visitableList = new ArrayList<>();

        visitableList.add(new Car());
        visitableList.add(new Bicycle());

        Visitor lightReplacement = new LightReplacement();
        Visitor tireReplacement = new TireReplacement();

        for(Visitable visitable : visitableList){
            visitable.accept(lightReplacement);
            visitable.accept(tireReplacement);
        }
    }
}