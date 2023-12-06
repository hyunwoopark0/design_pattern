package pattern.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class SaveTaker {
    private List<SavePoint> savePointList = new ArrayList<SavePoint>();

    public void add(SavePoint point){
        savePointList.add(point);
    }

    public SavePoint get(int index){
        return savePointList.get(index);
    }
}