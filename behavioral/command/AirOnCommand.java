package pattern.behavioral.command;

public class AirOnCommand implements Command{

    private AirConditioner airConditioner;

    public AirOnCommand(AirConditioner airConditioner){
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        this.airConditioner.on();
    }
}