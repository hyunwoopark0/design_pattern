package pattern.behavioral.mediator;

public class Client {
    public static void main(String[] args) {

        Mediator mediator = new ConcreteMediator();

        Colleague colleague1 = new ConcreteColleague(mediator, "user1");
        Colleague colleague2 = new ConcreteColleague(mediator, "user2");

        mediator.addUser(colleague1);
        mediator.addUser(colleague2);

        colleague1.send("안녕");
        colleague2.send("안녕");
    }
}