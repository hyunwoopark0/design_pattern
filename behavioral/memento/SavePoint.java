package pattern.behavioral.memento;

public class SavePoint {
    private String point;

    public SavePoint(String point){
        this.point = point;
    }

    public String getPoint(){
        return this.point;
    }
}