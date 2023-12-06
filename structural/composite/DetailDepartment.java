package pattern.structural.composite;

public class DetailDepartment implements Department{
    String code;

    public DetailDepartment(String code){
        this.code = code;
    }
    @Override
    public String getAllCode() {
        return code;
    }
}