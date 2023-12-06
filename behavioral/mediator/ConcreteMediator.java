package pattern.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator{

    private final List<Colleague> users;

    public ConcreteMediator(){
        this.users = new ArrayList<>();
    }

    @Override
    public void addUser(Colleague user) {
        this.users.add(user);
        sendMessage(user.name+" 입장", user);
    }

    @Override
    public void deleteUser(Colleague user) {
        sendMessage(user.name+" 퇴장", user);
    }

    @Override
    public void sendMessage(String message, Colleague user) {
        for (Colleague _user : this.users){
            if(_user != user) _user.receive(message);
        }
    }
}
