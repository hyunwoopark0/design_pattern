package pattern.behavioral.iterator;

public class Student{
    private String name;
    private Integer height;

    public Student(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}