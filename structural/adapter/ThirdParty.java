package pattern.structural.adapter;

public class ThirdParty implements ThirdPartySerivce {

    @Override
    public void run() {
        System.out.println("third party service run");
    }
}