package pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class GroupDepartment implements Department{
    String code;
    List<Department> departments = new ArrayList<>();

    public GroupDepartment(String code){
        this.code = code;
    }

    public void add(Department department){
        this.departments.add(department);
    }

    public List<Department> getDepartments(){
        return departments;
    }

    @Override
    public String getAllCode() {
        String allCode = code;

        for (Department department : departments){
            allCode += department.getAllCode();
        }

        return allCode;
    }
}
