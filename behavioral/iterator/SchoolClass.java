package pattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SchoolClass implements AbstractClass{
    private List<Student> studentList = new ArrayList<>();

    public void add(Student student){
        this.studentList.add(student);
    }

    @Override
    public Iterator<Student> createIterator() {
        return new DescHeightIterator(this.studentList);
    }
}