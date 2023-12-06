package pattern.behavioral.mediator;

public class ConcreteColleague extends Colleague{
    public ConcreteColleague(Mediator mediator, String name){
        super(mediator, name);
    }
    @Override
    public void send(String msg) {
        System.out.println("발신자 "+this.name + ":" +msg);
        mediator.sendMessage(msg, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println("수신자 "+ this.name + ":" + msg);

    }
}