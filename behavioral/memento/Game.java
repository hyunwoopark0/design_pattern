package pattern.behavioral.memento;

public class Game {
    private String point;

    public void setPoint(String point){
        this.point = point;
    }

    public String getPoint(){
        return this.point;
    }

    public SavePoint saveCurrentPoint(){
        return new SavePoint(this.point);
    }

    public void getSavePoint(SavePoint savePoint){
        this.point = savePoint.getPoint();
    }
}