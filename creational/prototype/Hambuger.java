package pattern.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Hambuger implements Cloneable{
    private List<String> hambugerList;

    public Hambuger(){
        hambugerList = new ArrayList<>();
    }

    public Hambuger(List<String> hambugerList) {
        this.hambugerList = hambugerList;
    }

    public void setHambugerList(){
        this.hambugerList.add("bulgogi");
        this.hambugerList.add("cheeze");
        this.hambugerList.add("chicken");
        //...
    }

    public List<String> getHambugerList(){
        return this.hambugerList;
    }
    // shallow copy
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    // deep copy
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Hambuger(new ArrayList<>(this.hambugerList));
    }
}
