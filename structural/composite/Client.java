package pattern.structural.composite;

public class Client {
    public static void main(String[] args) {
        GroupDepartment groupDepartment1 = new GroupDepartment("A");
        DetailDepartment detailDepartment1 = new DetailDepartment("A1");
        DetailDepartment detailDepartment2 = new DetailDepartment("A2");
        GroupDepartment groupDepartment2 = new GroupDepartment("AA");
        DetailDepartment detailDepartment3 = new DetailDepartment("AA1");

        groupDepartment1.add(detailDepartment1);
        groupDepartment1.add(detailDepartment2);

        groupDepartment2.add(detailDepartment3);
        groupDepartment1.add(groupDepartment2);

        System.out.println(groupDepartment1.getAllCode());
    }
}