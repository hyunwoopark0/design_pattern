package pattern.behavioral.command;

public class Client {
    public static void main(String[] args) {
        Door door = new Door();
        AirConditioner airConditioner = new AirConditioner();

        OpenDoorCommand openDoorCommand = new OpenDoorCommand(door);
        AirOnCommand airOnCommand = new AirOnCommand(airConditioner);
        Car car = new Car();

        car.setCommand(openDoorCommand);
        car.executeCommand();

        car.setCommand(airOnCommand);
        car.executeCommand();
    }
}