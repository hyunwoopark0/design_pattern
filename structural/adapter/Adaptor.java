package pattern.structural.adapter;

public class Adaptor implements OrginService{
    ThirdPartySerivce thirdPartySerivce;

    Adaptor(ThirdPartySerivce thirdPartySerivce){
        this.thirdPartySerivce = thirdPartySerivce;
    }

    @Override
    public void execute() {
        this.thirdPartySerivce.run();
    }
}