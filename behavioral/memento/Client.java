package pattern.behavioral.memento;

public class Client {
    public static void main(String[] args) {

        Game game = new Game();
        SaveTaker saveTaker = new SaveTaker();

        game.setPoint("1");
        saveTaker.add(game.saveCurrentPoint());
        game.setPoint("2");
        saveTaker.add(game.saveCurrentPoint());
        game.setPoint("3");

        System.out.println("current save point =>" + game.getPoint());
        game.getSavePoint(saveTaker.get(0));
        System.out.println("first save point =>" + game.getPoint());
        game.getSavePoint(saveTaker.get(1));
        System.out.println("second save point =>" + game.getPoint());

    }
}
